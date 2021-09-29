package ejecuta;

import java.util.HashMap;
import java.util.Scanner;

import clases.Alumno;
import clases.RepoAlumno;

public class Inicio2 {

	public static void main(String[] args) {

		
		RepoAlumno repo= new RepoAlumno();
		Scanner sc= new Scanner(System.in);
		int matricula;
		Alumno alumno;
		HashMap<Integer, Alumno> datos;
		String menu = "--MENU ALUMNOS--\n"
					+ "1  -LISTAR\n" 
					+ "2. Leer alumno\n"
					+ "3. Eliminar\n"
					+ "4. Editar\n"
					+ "5. Nuevo\n"
					+ "6. Salir\n";
		int opcion;
		do 
		{
			System.out.println(menu);
			System.out.println("Introduzca opción");
			
			opcion = Integer.valueOf(sc.nextLine());
			
			switch(opcion) {
			case 1:
				datos = repo.listar2();
				for(int matri : datos.keySet())
				{
					alumno= datos.get(matri);
					System.out.println(alumno.toString());
				}
			break;
			
			case 2:
				System.out.println("Introduza matricula");
				matricula = Integer.parseInt(sc.nextLine());
				
				alumno= repo.leer(matricula);
				System.out.println(alumno.toString());
			break;
			
			case 3:
				System.out.println("Introduza matricula");
				matricula = Integer.parseInt(sc.nextLine());
				
				repo.eliminar2(matricula);
				break;
				
			case 4:
				System.out.println("Introduza matricula");
				matricula = Integer.parseInt(sc.nextLine());
				
				alumno = new Alumno();
				System.out.println("A contiuacion se le pedirá los datos modificados");
				
				System.out.println("\tMATRICULA: ");
				alumno.matricula= Integer.valueOf(sc.nextLine());
				
				System.out.println("\tNombre: ");
				alumno.nombre=sc.nextLine();
				
				repo.editar(matricula, alumno);
			break;
				
			case 5:
				alumno = new Alumno();
				System.out.println("A contiuacion se le pedirá los datos del nuevo Alumno");
				
				System.out.println("\tMATRICULA: ");
				alumno.matricula= Integer.valueOf(sc.nextLine());
				
				System.out.println("\tNombre: ");
				alumno.nombre=sc.nextLine();
				
				repo.nuevo(alumno);
				break;
			
			case 6:
				break;
				
				default:
				System.out.println("Opcion incorrecta ");
			}
		} while(opcion!=6);
	}

}
