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
 * Metodo que realiza la consulta segun seleccion. Servlet implementation class
 * PerroServlet
 * 
 * @author Ana Solorzano
 */
@WebServlet("/PerroServlet")
public class PerroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doRequest(request, response);

	}

	private void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operacion;

		// Comprobamos el tipo de accion que se solicita
		operacion = request.getParameter("operacion");
		PerroDao op = new PerroDao();

		int perroID = request.getParameter("perroID")==null?0:Integer.parseInt(request.getParameter("perroID"));
		String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");
		String tamano = request.getParameter("tamano");
		String genero = request.getParameter("genero");
		String raza = request.getParameter("raza");
		String imagen = request.getParameter("imagen");
		String estado = request.getParameter("estado");
		String descripcion = request.getParameter("descripcion");

		if (operacion.equals("alta")) {
			// ALTA
			// Se supone que esta en jsp de registro

			op.crearPerro(nombre, edad, tamano, genero, raza, imagen, estado, descripcion);
			response.sendRedirect("PerroServlet?operacion=listado");

		} else if (operacion.equals("modificar")) {
			// MODIFICAR
			// viene de listado y entra en PerroDetalle.jsp falta añadir los ultimos campos
			op.modificarPerro(perroID, nombre, edad, tamano, genero, raza, imagen, estado, descripcion);
			response.sendRedirect("DetalleServlet?ID=" + perroID);

		} else if (operacion.equals("baja")) {
			// DELETE LOGICO
			op.darBajaPerro(perroID);
			response.sendRedirect("PerroServlet?operacion=listado");

		} else if (operacion.equals("listado")) {
			// Muestra resultados de búsqueda
			
			PerroDao perroDao = new PerroDao();
			List<Perro> listPerros = perroDao.buscarPerros(request.getParameter("edad"),
					request.getParameter("tamanno"), request.getParameter("genero"));

			request.setAttribute("listaPerros", listPerros);
			RequestDispatcher view = request.getRequestDispatcher("Principal.jsp");
			view.forward(request, response);
		}
	}
}
