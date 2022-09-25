package ui;

import java.util.Date;
import java.util.Scanner;
import dol.Student;
import misc.DateUtil;

public class PersonForm {
	Scanner scan;
	Student Student;
	
	public PersonForm(Scanner scanner) {
		scan = scanner;
	}
	
	public PersonForm(Student s) {
		Student = s;
	}
	
	

	public Student catchPerson() {
		Student s = new Student();
		System.out.println("Primer nombre: ");
		s.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		s.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		s.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		s.setSecondSurname(scan.next());
		
		System.out.println("Género: ");
		s.setGender(scan.next());
		
		Date date = DateUtil.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		s.setBirthDate(date);
		
		System.out.println("Cual Carrera esta estudiandon?");
		s.setCareer(scan.next());
		
		System.out.println("Que año cursa?");
		s.setGrade(scan.next());
		
		System.out.println("Grupo de Clase?");
		s.setClassroom(scan.next());
		
		return s;
	}
	
	
	
	public void showPerson() {
		System.out.printf("Primer nombre del Estudiante: %s\n" , Student.getFirstName());		
		
		System.out.printf("Segundo nombre del Estudiante: %s\n", Student.getMiddleName());
		
		System.out.printf("Primer apellido del Estudiante: %s\n", Student.getSurName());
		
		System.out.printf("Segundo apellido del Estudiante: %s\n", Student.getSecondSurname());
		
		System.out.printf("Género: %s\n", Student.getGender());
		
		System.out.printf("Fecha de nacimiento: %s\n", DateUtil.dateToString(Student.getBirthDate(), "dd/MM/yyyy"));
		
		System.out.printf("Edad del Estudiante: %s\n", Student.getAge());
		
		System.out.printf("Carrera: %s\n" , Student.getCareer());		
		
		System.out.printf("Año Cursado: %s\n", Student.getGrade());
		
		System.out.printf("Grupo de Clase: %s\n", Student.getClassroom());
		
		System.out.printf("Carnet del Estudiante: %s\n", dol.Student.getSerialversionuid());
		
		
			
	}
	
}
