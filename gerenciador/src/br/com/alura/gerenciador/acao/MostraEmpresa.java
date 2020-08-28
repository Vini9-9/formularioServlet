package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		
		Banco banco = new Banco();
		
		Empresa empresaAlterada = banco.findCompanyById(paramId);
		
//		log.setLogDataCadastro(empresaDeletada, tipoDaAcao);
		
		RequestDispatcher rd = request.getRequestDispatcher("/mostraEmpresa.jsp");
		request.setAttribute("empresa", empresaAlterada);
		
		rd.forward(request, response);
	}

}
