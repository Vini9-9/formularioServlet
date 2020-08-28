package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String paramId = request.getParameter("id");
		
//		newEmpresa.setLogDataCadastro(currentDateHour);
		
		
		// Coletando dados atualizados
		
		Banco banco = new Banco();
		
		Empresa empresaAlterada = banco.findCompanyById(paramId);
		
		String nomeDaEmpresa = request.getParameter("nome");
  		String paramDataCadastrada = request.getParameter("data");		
		
  		empresaAlterada.setNome(nomeDaEmpresa);
		
		try {
			empresaAlterada.setDataCadastroFormatted(paramDataCadastrada);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}

}
