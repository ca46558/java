package tw.test.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test04")
public class test04 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {// IO本身不已經宣告拋出例外 不用再加try catch
		response.setContentType("text/html; charset=UTF-8");//調整成html格式
		
		PrintWriter out = response.getWriter();
		System.out.println("Hello World");
		out.print("Hello World");
		out.print("<h1> Brad Big Company</h1>");
		out.print("<hr />");
		out.print("Hello World");
		out.flush();
		out.close();
	}

}
