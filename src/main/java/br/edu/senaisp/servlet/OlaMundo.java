package br.edu.senaisp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/OlaMundo")
public class OlaMundo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//navegador chama a pagina
		
	   /* PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>OlaMundo!</h1>");
		pw.println("</body>");
		pw.println("</html>");*/
		
		String valor = req.getParameter("param1");
		resp.getWriter().append("<html><body><h1> Olá Mundo!!" + valor + "</h1></body></html>" );
		
		
	}
	
}