package tw.test.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.test.apis.MyModel;

import java.io.IOException;

import org.apache.tomcat.jakartaee.EESpecProfile;

/**
 * Controller
 */
@WebServlet("/test17")
public class test17 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		
		//--
		try {
			MyModel model = new MyModel(x, y);
			String result = model.plus();
			
			request.setAttribute("x", x);
			request.setAttribute("y", y);
			request.setAttribute("result", result);
			request.setAttribute("view", "view2");
		}catch(Exception e) {
			request.setAttribute("x", "");
			request.setAttribute("y", "");
			request.setAttribute("result", "");
			request.setAttribute("view", "view2");
		}
		
		//---
		RequestDispatcher dispatcher = request.getRequestDispatcher("test19");
		response.setContentType("text/html; charset=utf-8");
		dispatcher.forward(request, response);
	}

}
