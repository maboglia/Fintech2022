package integration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.RecordService;

import java.io.IOException;

import org.json.JSONArray;

/**
 * Servlet implementation class RestController
 */
@WebServlet("/api")
public class RestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private RecordService service;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestController() {
        super();
        this.service = new RecordService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JSONArray records = new JSONArray(this.service.getRecords());
		
		response.setContentType("application/json");
		
		response.getWriter().append(records.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
