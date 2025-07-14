package tw.test.servlet;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Requires;

import org.apache.catalina.authenticator.SavedRequest;

@WebServlet("/test08")
public class test08 extends HttpServlet {
	public test08() {
		System.out.println("test08()");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig)");
		super.init(config);
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service(ServletRequest, ServletResponse)");
		if (arg0 instanceof HttpServletRequest) {
			System.out.println("Y");
		} else {
			System.out.println("NO");
		}
		super.service(arg0, arg1);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service(HttpServletRequest, HttpServletResponse)");
//		super.service(arg0, arg1);

		

	}

	@Override
	public void init() throws ServletException {
		System.out.println("init()");
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet()");
	}

}
