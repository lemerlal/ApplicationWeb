package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connect.VilleFranceDAOImpl;

/**
 * Servlet implementation class servletAccueil
 */
@WebServlet("/accueil")
public class servletAccueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VilleFranceDAOImpl villeFrance = new VilleFranceDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletAccueil() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * Servlet permettant d'accéder à la page résultat 
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ville1 = request.getParameter("ville1");
		String ville2= request.getParameter("ville2");
		
		Double distance;
		try {
			distance = villeFrance.findVille(ville1,ville2);
			HttpSession session = request.getSession();
			session.setAttribute("distance", distance);
			RequestDispatcher dispat = request.getRequestDispatcher("Accueil.jsp");
			dispat.forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (java.lang.NullPointerException e) {
			RequestDispatcher dispat = request.getRequestDispatcher("index.jsp");
			dispat.forward(request, response);
		} 
		
		
	}
	


}
