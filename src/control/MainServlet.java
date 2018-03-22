package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.PerroDao;
import model.Perro;

/**
 * Servlet implementation class MainServlet
 * @author David Claro
 */
//@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public MainServlet() {
		super();
    }

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
		
		PerroDao perroDao = new PerroDao();
		List<Perro> listPerros = perroDao.listarPerro();
		
		request.setAttribute("listaPerros", listPerros);
		RequestDispatcher view = request.getRequestDispatcher("Principal.jsp");
        view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

}
