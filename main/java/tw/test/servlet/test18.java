package tw.test.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.test.apis.testUtils;

import java.io.IOException;

// 18 => view1
@WebServlet("/test18")
public class test18 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = (String)request.getAttribute("x");
		String y = (String)request.getAttribute("y");
		String result = (String)request.getAttribute("result");
		
		try {
			String webContent = testUtils.loadView();
			response.getWriter().print(String.format(webContent, x, y, result));
			response.flushBuffer();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}


}
