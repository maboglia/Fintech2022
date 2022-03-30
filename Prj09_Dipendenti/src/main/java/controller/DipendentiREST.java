package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Dipendente;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class DipendentiREST
 */
@WebServlet("/api/gestione")
public class DipendentiREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private LibroMatricola lm = new LibroMatricolaImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DipendentiREST() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json");
		
		JSONArray contenitore = new JSONArray();
		
		for (Dipendente d : lm.getAll()) {
			
			JSONObject dip = new JSONObject(d);
			contenitore.put(dip);
			
		}
		
		response.getWriter().append(contenitore.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
