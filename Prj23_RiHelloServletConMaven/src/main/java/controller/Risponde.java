package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class Risponde
 */
@WebServlet("/richiesta")
public class Risponde extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<Libro> libri;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Risponde() {
        super();
        
        this.libri = new ArrayList<>();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setStatus(200);
		response.setContentType("application/json");

		JSONArray json = new JSONArray(this.libri);
		
		response.getWriter().append(json.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		if (request.getParameter("titolo")!=null) {
			String titolo = request.getParameter("titolo");
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			
			System.out.println(titolo);
			System.out.println(prezzo);
			
			Libro l = new Libro(titolo, prezzo);
			this.libri.add(l);
		}
		
		doGet(request, response);
	}

}
