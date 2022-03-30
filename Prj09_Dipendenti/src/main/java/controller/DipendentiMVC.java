package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DipendentiMVC
 */
@WebServlet("/gestione")
public class DipendentiMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LibroMatricola lm = new LibroMatricolaImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DipendentiMVC() {
        super();
        System.out.println("è stata creata la servlet DipendentiMVC :)");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("elenco", lm.getAll());
		request.getRequestDispatcher("tabella.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("nome")!=null && request.getParameter("ruolo")!=null) {
			lm.addDipendente(request.getParameter("nome"), request.getParameter("ruolo"));
		}

		doGet(request, response);
	}

}
