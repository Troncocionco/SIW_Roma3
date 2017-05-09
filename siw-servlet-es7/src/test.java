import javax.servlet.http.HttpSession;

import it.uniroma3.model.Student;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "G";
		String lastName = "t";
		String matricola = "4";
		boolean errors = false;
		
		String nextPage = "/newStudent.jsp";
		if( firstName == null || firstName.equals("")) {
			//request.setAttribute("firstNameErr", "First Name is mandatory");
			errors = true;
		}

		if(!errors) {
			Student student = new Student();
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setMatricola(matricola);
			
			//HttpSession session = request.getSession();
			//session.setAttribute("student", student);
		}
		else {
			nextPage = "/student.jsp";
		}
		
		System.out.println(errors);
		System.out.println(nextPage);
		
	}

}
