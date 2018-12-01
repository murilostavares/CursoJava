package br.com.cursojava.aula009;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JspControler extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		String ipSolicitante = req.getRemoteHost();
		Date dataHora = new Date();

		req.setAttribute("parh", path);
		req.setAttribute("ipSolicitante", ipSolicitante);
		req.setAttribute("dataHora", dataHora);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/views/Hello.jsp");
		dispatcher.forward(req, resp);

	}

}
