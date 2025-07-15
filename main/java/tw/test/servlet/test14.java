package tw.test.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.test.apis.Bike;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test14")
public class test14 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Object objX = request.getAttribute("x");
		int x = (Integer) objX;
		int y = (Integer) request.getAttribute("y");
		Bike bike = (Bike)request.getAttribute("bike");
		
		String name = request.getParameter("name");

		PrintWriter out = response.getWriter();
		out.printf("x = %d y = %d", x, y);
		out.printf("Bike = %f<br>", bike.getSpeed());
		out.printf("Name = %s<br>", name);

	}

}
