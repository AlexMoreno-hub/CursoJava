package paquete;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Programa que lee 4 n�meros, y en el caso en el que el primero introducido sea igual al
		�ltimo, nos muestra la media. En caso contrario, no se mostrar� nada.*/
		
		int primero;
		int ultimo;
		int suma=0;
		float media;
		Scanner sc= new Scanner (System.in);
		
	
		System.out.println("Introduce el 1� numero: ");
		primero= sc.nextInt();
		suma += primero;
		
		for (int i = 2; i <= 3; i++) {
			System.out.println("Introduce el "+ i + "� numero");
			suma+=sc.nextInt();		
		}
	
		System.out.println("Introduce el �ltimo numero: ");
		ultimo= sc.nextInt();
		suma+= ultimo;
		
		if(primero == ultimo) {
			
			media= suma/4f;
			System.out.println("La media es :" + media);
		}
		
		
	}
	
		
}

