package ejecuta;

import java.util.Scanner;

import clases.GestionListado;

public class Inicio {

	public static void main(String[] args) {

		/*
		31. Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		4.- Eliminar todos los números.
		5.- Salir.	
		*/

		GestionListado gestion =  new GestionListado();
		Scanner sc= new Scanner (System.in);	
		int opcion;
		int numero;
		String menu;
		
		menu="<--Menu:-->\n"
				+ "		1.- Introducir número entero.\r\n"
				+ "		2.- Listar números.\r\n"
				+ "		3.- Eliminar número.\r\n"
				+ "		4.- Eliminar todos los números.\r\n"
				+ "		5.- Salir.	";
		
		do {
			System.out.println(menu);
			
			try {	
			opcion=Integer.valueOf(sc.nextLine());
			
			switch(opcion) {
			
			case 1:
				System.out.println("introduzca numero");
				numero=Integer.valueOf(sc.nextLine());
				gestion.nuevo(numero);
			break;
			
			case 2:
				gestion.listar();
			break;
			
			case 3:
				System.out.println("introduzca numero");
				numero=Integer.valueOf(sc.nextLine());
				gestion.eliminar(numero);
			break;
			
			case 4:	
				gestion.eliminar();
			break;
			
			case 5:
			break;
			
			default:
				break;
			}
		}
			catch(Exception e){
				System.out.println("Error, introduce un numero");
				opcion=5;
			}
		}
			while(opcion!=5);
		
			}	

}
