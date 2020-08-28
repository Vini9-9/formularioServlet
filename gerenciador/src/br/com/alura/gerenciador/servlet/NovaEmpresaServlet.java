package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Processo de Cadastro de empresa iniciado...");
		
		//urlPattern?nome=parameter
		
		Empresa newEmpresa = new Empresa();
		
		DateTimeFormatter dtfHour = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		
		
		Date currentDateHour = new Date();
		
		String nomeDaEmpresa = request.getParameter("nome");
		String paramDataCadastrada = request.getParameter("data");
		
		
		Date dataCadastrada = null;
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			dataCadastrada = sdf.parse(paramDataCadastrada);
//		} catch (ParseException e) {
//			throw new ServletException(e);
//		}
		

		
		
//		PrintWriter out = response.getWriter();
		
		if (nomeDaEmpresa == null || nomeDaEmpresa.trim().isEmpty() ) {
			
			System.out.println(dtfHour.format(agora) + ": Não foi possível cadastrar a empresa (" + nomeDaEmpresa + ") pois o nome informado é inválido");
			
		} else {
			
			newEmpresa.setNome(nomeDaEmpresa);
			
			try {
				newEmpresa.setDataCadastroFormatted(paramDataCadastrada);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			newEmpresa.setLogDataCadastro(currentDateHour);
			
			Banco banco = new Banco();
			
			banco.adiciona(newEmpresa);
			
		}
		
		response.sendRedirect("listaEmpresas");
		
		/*			Mensagem de confirmação
		
		RequestDispatcher rd = request.getRequestDispatcher("/NovaEmpresaCriada.jsp");
		request.setAttribute("nomeDaEmpresa", newEmpresa.getNome());
		rd.forward(request, response);
			
		*/

			
	
			
		
	}

}
