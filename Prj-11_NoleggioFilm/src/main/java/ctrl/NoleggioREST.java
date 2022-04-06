package ctrl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

import org.json.JSONArray;

/**
 * Servlet implementation class NoleggioMVC
 */
@WebServlet("/api/film")
public class NoleggioREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoleggioREST() {
        super();
        System.out.println("Costruttore della servlet MVC");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Metodo GET");
		JSONArray array = new JSONArray(FilmCtrl.getAll());
		response.setContentType("application/json");
		response.getWriter().append(array.toString());
	}


}
