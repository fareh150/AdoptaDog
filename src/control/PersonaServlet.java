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
		//crearVoluntario
		//bajaVoluntario
		
		
		//Muestra resultados de búsqueda
		/*PerroDao perroDao = new PerroDao();
		List<Perro> listPerros = perroDao.buscarPerros(request.getParameter("edad"), request.getParameter("tamanno"),
				request.getParameter("genero"));

		request.setAttribute("listaPerros", listPerros);
		RequestDispatcher view = request.getRequestDispatcher("Principal.jsp");
		view.forward(request, response);*/

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
