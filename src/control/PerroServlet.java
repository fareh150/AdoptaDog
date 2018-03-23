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
		//doRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doRequest(request, response);

	}

	private void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String operacion;
		String buscar = request.getParameter("buscar");
		operacion = request.getParameter("operacion");
		
		if (buscar.equals("busqueda") ) {

			busquedaPerro(request, response);
		}
		if (operacion != null) {

			crudPerro(request, response, operacion);
		}		
	}
/**
 * Metodo llama la alta, baja o modificacion los datos que envia PerroDao
 * @param request
 * @param response
 * @param operacion
 * @throws ServletException
 * @throws IOException
 */
	private void crudPerro(HttpServletRequest request, HttpServletResponse response, String operacion)
			throws ServletException, IOException {

		// Comprobamos el tipo de accion que se solicita
		PerroDao op = new PerroDao();

		int perroID = request.getParameter("perroID") == null ? 0 : Integer.parseInt(request.getParameter("perroID"));
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
			op.crearPerro(nombre, edad, tamano, genero, raza, imagen, estado, descripcion);
			response.sendRedirect("PerroServlet?operacion=listado");

		} else if (operacion.equals("modificar")) {
			// MODIFICAR
			op.modificarPerro(perroID, nombre, edad, tamano, genero, raza, imagen, estado, descripcion);
			response.sendRedirect("DetalleServlet?ID=" + perroID);

		} else if (operacion.equals("baja")) {
			// DELETE LOGICO
			op.darBajaPerro(perroID);
			response.sendRedirect("PerroServlet?operacion=listado");

		}
	}
/**
 * Corresponde a la búsqueda en la pagina principal a traves de los combos: edad, tamaño y genero. Toma sólo los campos seleccionados para realizar la busqueda en BBDD.
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
	private void busquedaPerro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Muestra resultados de búsqueda

		PerroDao perroDao = new PerroDao();
		List<Perro> listPerros = perroDao.buscarPerros(request.getParameter("edad"), request.getParameter("tamanno"),
				request.getParameter("genero"));

		request.setAttribute("listaPerros", listPerros);
		RequestDispatcher view = request.getRequestDispatcher("Principal.jsp");
		view.forward(request, response);
	}
}
