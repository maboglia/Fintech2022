package controller;

import java.io.IOException;
import java.util.Random;

import org.json.JSONArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Parola;
import model.ParoleService;

@WebServlet("/api/parole")
public class RestController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		Random r = new Random();
//		int i = r.nextInt(ParoleService.parole.size());
//		
//		Parola parola = ParoleService.parole.get(i);
		
		JSONArray array = new JSONArray(ParoleService.parole);
		
		
		resp.setContentType("application/json");
		resp.getWriter().append(array.toString());
		
	}

	
	
	
	
}
