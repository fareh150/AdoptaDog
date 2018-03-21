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
 * Servlet implementation class DetalleServlet
 * @author AnaSolorzano
 */
@WebServlet("/DetalleServlet")
public class DetalleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Envia a PerroDetalle.jsp el detalle del perro
	
			/*PerroDao perroDao = new PerroDao();
			List<Perro> listPerros = perroDao.buscarPerros(request.getParameter("edad"), request.getParameter("tamanno"),
					request.getParameter("genero"));

			request.setAttribute("listaPerros", listPerros);
			RequestDispatcher view = request.getRequestDispatcher("Principal.jsp");
			view.forward(request, response);*/
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetalleServlet() {
        super();
       
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
