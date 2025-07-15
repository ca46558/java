package tw.test.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.test.apis.testUtils;

import java.io.IOException;


@WebServlet("/test19")
public class test19 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = (String)request.getAttribute("x");
		String y = (String)request.getAttribute("y");
		String result = (String)request.getAttribute("result");
		String view = (String)request.getAttribute("view");
		
		try {
			String webContent = testUtils.loadView(view);
			String content = webContent.replaceAll("#x#", x)
			.replaceAll("#y#", y)
			.replaceAll("#result#", result);
			response.getWriter().print(content);
			
			response.flushBuffer();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}


}
