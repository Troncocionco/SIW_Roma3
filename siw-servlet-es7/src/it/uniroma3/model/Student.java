package it.uniroma3.model;

public class Student {
	
	private String firstName;
	private String lastName;
	private String matricola;
	
	public Student() {
		
	}
	
	public Student (String firtstName, String lastName, String matricola){
		this.firstName= firstName;
		this.lastName = lastName;
		this.matricola = matricola;
	}
	
	//Setters & Getters
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.getMatricola().equals(student.getMatricola());
	}

	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Student");  
		sb.append(", firstName='").append(firstName);
		sb.append(", lastName='").append(lastName); 
		sb.append(", matricola='").append(matricola);
		sb.append("}\n");
		return sb.toString();
	}
}
