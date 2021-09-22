package paquete;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * Programa que lee de manera consecutiva números hasta que se introducen dos números
		  iguales seguidos.
		 */
	
		int numero, otros;
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intro. numero: ");
		numero = sc.nextInt();
		do 
		{
			System.out.println("Intro. numero: ");
			otros = sc.nextInt();
			if(numero==otros)
			{
				continuar = false;
			}
			else {
				numero = otros;
			}
		} while(continuar);
		
		System.out.println("FIN");
		sc.close();
	}
			
		
	}
	

