package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Word;

import java.io.IOException;

@WebServlet("/wordle")
public class WordleGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Word parolaSegreta;
	

	public WordleGenerator() {
		this.parolaSegreta = new Word();
		System.out.println("Servlet costruita!!!");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("sono wordle!!!");
		
		request.getRequestDispatcher("layout/header.jsp").include(request, response);
		
//		response.getWriter().append("<h1>prova</h1>");
		request.setAttribute("parola", this.parolaSegreta.getSecret());

		request.getRequestDispatcher("form.jsp").include(request, response);

		request.getRequestDispatcher("elenco.jsp").include(request, response);
		
		request.getRequestDispatcher("layout/footer.jsp").include(request, response);
		
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("indovinoParola") != null) {
			
			String parola = request.getParameter("indovinoParola");
			
			if (parola.equals(this.parolaSegreta.getSecret())) {
				System.out.println("hai indovinato!!");
				this.parolaSegreta.genera();
				
			}
			
		}
		
		
		doGet(request, response);
		
		
		
	}

	
	
	
}
