package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;


@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String paramId = request.getParameter("id");
		
		Banco banco = new Banco();
		
		Empresa empresaDeletada = banco.findCompanyById(paramId);
		
//		log.setLogDataCadastro(empresaDeletada, tipoDaAcao);
		
		banco.exclui(empresaDeletada);
		
		response.sendRedirect("listaEmpresas");
		


	}



}
