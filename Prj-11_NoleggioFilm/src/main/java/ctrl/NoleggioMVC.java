package ctrl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * Servlet implementation class NoleggioMVC
 */
@WebServlet("/film")
public class NoleggioMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoleggioMVC() {
        super();
        System.out.println("Costruttore della servlet MVC");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Metodo GET");
		response.getWriter().append(FilmCtrl.getAll().toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("titolo")!=null) {
			
			String titolo = request.getParameter("titolo"); 
			String genere = request.getParameter("genere");
			int codice = Integer.parseInt(request.getParameter("codice"));
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			
			FilmCtrl.addFilm(codice, titolo, Arrays.asList(genere), prezzo);
		}
		doGet(request, response);
	}

}
