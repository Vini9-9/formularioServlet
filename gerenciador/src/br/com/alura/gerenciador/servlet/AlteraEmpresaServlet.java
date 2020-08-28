package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;


@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
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
		
		
		response.sendRedirect("listaEmpresas");
		
	}



}
