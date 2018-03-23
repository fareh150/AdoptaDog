package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.PersonaDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		proccesRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void proccesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("Decidir").equals("Iniciar")) {
			System.out.println("Holiii");
			System.out.println(request.getParameter("Login") + " " + request.getParameter("Contrasena"));
			PersonaDao personajillo = new PersonaDao();
			String perfil = personajillo.sacarPerfil(request.getParameter("Login"), request.getParameter("Contrasena")) ;
			System.out.println("El perfil es: " + perfil);
			if (perfil.equals("Administrador")) {
				System.out.println("Soy un admin");
				menuAdmin(request, response);
			}else if (perfil.equals("Voluntario")) {
				System.out.println("Soy un Voluntario");
			}else{
				errorLogin(request, response);
			}
		}
	}
	protected void menuAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher view = request.getRequestDispatcher("Admin.jsp");
		view.forward(request, response);
	}
	protected void errorLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher view = request.getRequestDispatcher("FallaLogin.jsp");
		view.forward(request, response);
	}

}
