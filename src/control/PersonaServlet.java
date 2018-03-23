package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.PersonaDao;
import model.Persona;

/**
 * Servlet implementation class PersonaServlet
 */
@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonaServlet() {
		super();
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// crearVoluntario
		// bajaVoluntario
		String url = request.getRequestURL().toString();
		if (url == "BackofficeAdministrador" && Integer.parseInt(request.getParameter("opcion")) == 1) {
			crearVoluntario(request, response);
		}else if (url == "BackofficeAdministrador" && Integer.parseInt(request.getParameter("opcion")) == 2) {
			bajaVoluntario(request, response);
		}

	}
	protected void crearVoluntario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PersonaDao persona = new PersonaDao();
		persona.crearPersona(request.getParameter("nombre"), request.getParameter("apellido"), request.getParameter("correo"), request.getParameter("telefono"), request.getParameter("direccion"), request.getParameter("perfil"), request.getParameter("foto"), request.getParameter("login"), request.getParameter("password"));
		RequestDispatcher view = request.getRequestDispatcher("PersonaDetalle.jsp");
		view.forward(request, response);
	}
	protected void bajaVoluntario(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException{
		
	}
	
	protected void DarBajaVoluntario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)ss
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
