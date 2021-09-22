package paquete;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Programa que pide el número de calificaciones a introducir, y una nota de corte. A
		continuación se introducirán las calificaciones, para finalmente indicar cuántas
		calificaciones han igualado o superado la nota de corte.
		 */

		int calificaciones;
		float nota;
		float notaCorte;
		int contador=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("¿Cuantas califiaciones?");
		calificaciones= sc.nextInt();
		System.out.println("¿Nota de corte?");
		notaCorte = sc.nextInt();
		
		for (int i = 0; i <= calificaciones; i++) {
				System.out.println("Introduce nota: ");
				nota=sc.nextFloat();
				
			if(nota >= notaCorte) {
				contador++;
			}
			
		}
		System.out.println("La han igualado o superado : " + contador);
	}

}
