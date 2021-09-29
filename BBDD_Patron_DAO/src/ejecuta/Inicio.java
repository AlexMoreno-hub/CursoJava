package ejecuta;

import java.util.Scanner;

import modelos.Alumno;
import repositorios.BaseDatos;
import repositorios.RepoAlumno;

public class Inicio {

	public static void main(String[] args) {
	
		Alumno alumno= new Alumno();
		RepoAlumno repo= new RepoAlumno("185.224.138.154", "u581554845_alumno","Root1234","u581554845_indra");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce matrícula");
		alumno.matricula= Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce nombre");
		alumno.nombre=sc.nextLine();
		
		System.out.println("Introduce apellido");
		alumno.apellido=sc.nextLine();
		
		try {
			repo.nuevo(alumno);
		} catch (Exception e) {
			System.out.println("NO se ha añadido");
		}
	}

}
