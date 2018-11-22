

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class redirect
 */
@WebServlet("/t2c")
public class redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public redirect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String c1 = request.getParameter("cou");
		if(c1.equals("Computer Networks"))
			response.sendRedirect("CN.html");
		else if(c1.equals("Software Engineering"))
			response.sendRedirect("SWE.html");
		else if(c1.equals("Theory of Computation"))
			response.sendRedirect("TOC.html");
		else if(c1.equals("Programming Tools"))
			response.sendRedirect("ProgTool.html");
		else if(c1.equals("Advanced Java Programming"))
			response.sendRedirect("AJ.html");
		else if(c1.equals("Fundamentals Of Computer Programming"))
			response.sendRedirect("FOP.html");
		else if(c1.equals("Calculus"))
			response.sendRedirect("CAL.html");
		else if(c1.equals("Data Structures"))
			response.sendRedirect("DS.html");
		else if(c1.equals("Algebra and Differential Equations"))
			response.sendRedirect("ADE.html");
		else if(c1.equals("Digital Logic and Circuits"))
			response.sendRedirect("DLC.html");
		else if(c1.equals("Discrete Maths"))
			response.sendRedirect("DM.html");
		else if(c1.equals("Communication Systems"))
			response.sendRedirect("CS.html");
		else if(c1.equals("OOPS"))
			response.sendRedirect("OOPS.html");
		else if(c1.equals("Probability and Random Process"))
			response.sendRedirect("PROB.html");
		else if(c1.equals("Computer Architecture and Organization"))
			response.sendRedirect("COA.html");
		else if(c1.equals("Design and Analysis of Algorithms"))
			response.sendRedirect("DAA.html");
		else if(c1.equals("Operating Systems"))
			response.sendRedirect("OS.html");
		else if(c1.equals("DBMS"))
			response.sendRedirect("DBMS.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
