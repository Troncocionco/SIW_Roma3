package it.uniroma3.servlet;

import it.uniroma3.model.Student;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String matricola = request.getParameter("matricola");
		
		Boolean errors = false;
		
		String nextPage = "/student.jsp";
		
		if( firstName == null || firstName.equals("")) {
			request.setAttribute("firstNameErr", "First Name is mandatory");
			errors = true;
		}
		
		if( lastName == null || lastName.equals("")) {
			request.setAttribute("lastNameErr", "Last Name is mandatory");
			errors = true;
		}
		
		if( matricola == null || matricola.equals("")) {
			request.setAttribute("matricolaErr", "Matricola is mandatory");
			errors = true;
		}
		
		if(!errors) {
			Student student = new Student();
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setMatricola(matricola);
			
			HttpSession session = request.getSession();
			session.setAttribute("student", student);
			request.setAttribute("test", "controlloSuperato");
		}
		else {
			nextPage = "/newStudent.jsp";
			request.setAttribute("test", "controlloFallito");

//			String test1= "";
//			String test2= "";
//			if(firstName.equals("")){test1 = "é vuota"; }
//			else {test1 = "non è vuota";}
//			
//			if(firstName==null){test2 = "é null"; }
//			else {test2 = "non è null";}
//			request.setAttribute("test1_firstName",test1);
//			request.setAttribute("test2_firstName",test2);
		}
		
		nextPage = response.encodeURL(nextPage);
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
			
	}

}
