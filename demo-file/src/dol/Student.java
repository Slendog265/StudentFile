package dol;

import java.util.Date;

public class Student extends Person{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1046846L;
	private String Grade;
	private String Classroom;
	private String Career;
	private String Carnet;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate, String grade, String classroom, String career, String carnet) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate);
		Grade = grade;
		Classroom = classroom;
		Career = career;
		Carnet = carnet;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getClassroom() {
		return Classroom;
	}

	public void setClassroom(String classroom) {
		Classroom = classroom;
	}

	public String getCareer() {
		return Career;
	}

	public void setCareer(String career) {
		Career = career;
	}

	public String getCarnet() {
		return Carnet;
	}

	public void setCarnet(String carnet) {
		Carnet = carnet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	
	
	
	
	
	
	
	
}
