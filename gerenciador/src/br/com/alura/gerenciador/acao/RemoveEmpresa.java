package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class RemoveEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String paramId = request.getParameter("id");
		
		Banco banco = new Banco();
		
		Empresa empresaDeletada = banco.findCompanyById(paramId);
		
//		log.setLogDataCadastro(empresaDeletada, tipoDaAcao);
		
		banco.exclui(empresaDeletada);
		
		/*response.sendRedirect("listaEmpresas");*/
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}

}
