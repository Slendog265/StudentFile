package bll;

import java.util.Scanner;

import dal.PersonDal;
import ui.PersonForm;

public class Application {
	private Scanner scan;
	public Application() {
		 scan = new Scanner(System.in);
	}
	public void displayOptions() {
		System.out.println("Gestionar Estudiantes");
		System.out.println("1. Agregar Estudiante");
		System.out.println("2. Mostrar Estudiante");
		System.out.println("3. Volver");
		
	}

	public void show() {
		short option = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1:
					save();
					break;
				case 2:
					open();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
		}while(option!=3);
		
	}
	public void save() {
		PersonForm pf = new PersonForm(scan);
		PersonDal pd = new PersonDal();
		pd.setStudent(pf.catchPerson());
		
		System.out.println("Por favor indica la ruta para guardar el archivo: ");
		String filePath = scan.next();
		System.out.println("Por favor indica el nombre del archivo: ");
		String fileName = scan.next();
		
		pd.setFilePath(filePath);
		pd.setFileName(fileName);
		pd.save();
	}
	
	public void open() {
	
			
		System.out.println("Por favor indica la ruta del archivo a abrir");
		String filePath = scan.next();
		PersonDal pd = new PersonDal();
		pd.setFilePath(filePath);
		PersonForm pf = new PersonForm(pd.open());
		pf.showPerson();
		
	}

}
