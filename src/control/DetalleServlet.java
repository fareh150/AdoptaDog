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
 * @author Eduardo Rodriguez
 */
@WebServlet("/DetalleServlet")
public class DetalleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// se recoge la variable ID y se le hace casting a int para usarlo en el metodo
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int c =Integer.parseInt(request.getParameter("ID"));
			
	// con el ID del perro lo uso el metodo para buscar en la base de datos y me entregue ese perro como objeto	
			
			PerroDao perrito = new PerroDao();
			Perro perroFinal=perrito.detallePerro(c);
			
	// direcciono a la pagina detalle de perro donde se muestra el detalle del perro en cuestion
			
			request.setAttribute("perroFinal", perroFinal);
			RequestDispatcher view = request.getRequestDispatcher("PerroDetalle.jsp");
			view.forward(request, response);}
			
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
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
