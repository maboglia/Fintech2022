package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Azione;
import model.Portafoglio;
import model.Settore;

import java.io.IOException;

/**
 * Servlet implementation class Router
 */
@WebServlet("/api/azioni")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GestionePortafoglio gp;  
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Router() {
        super();
        
        
			this.gp = new GestionePortafoglio(
				new Portafoglio("Portafoglio sig.rossi")	);
			
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("portafoglio", gp.getAzioni());
		
		request.getRequestDispatcher("../list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("codice") != null){
			
			int codice = Integer.parseInt( request.getParameter("codice") );
			int quotazione = Integer.parseInt( request.getParameter("quotazione") );
			String nome = request.getParameter("nome");
			Azione a = new Azione();
			a.setCodice(codice);
			a.setNome(nome);
			a.setQuotazione(quotazione);
			a.setSettore(Settore.TECH);
			
			gp.addAzione(a);
			
		}
		
		doGet(request, response);
	}

}
