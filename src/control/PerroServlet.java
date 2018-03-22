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
 * Metodo que realiza la consulta segun las condiciones de los combos.
 * Servlet implementation class PerroServlet
 * @author Ana Solorzano
 */
@WebServlet("/PerroServlet")
public class PerroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Muestra resultados de búsqueda
		PerroDao perroDao = new PerroDao();
		List<Perro> listPerros = perroDao.buscarPerros(request.getParameter("edad"), request.getParameter("tamanno"),
				request.getParameter("genero"));

		request.setAttribute("listaPerros", listPerros);
		RequestDispatcher view = request.getRequestDispatcher("Principal.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}
