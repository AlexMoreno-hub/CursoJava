package paquete;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*10. Programa que lee 10 números e indica si todos los números son iguales o no.
		 	Lo dice despues de introducir todos los numeros
		 * */


		int numero;
		int otros;
		Scanner sc = new Scanner(System.in);
		boolean iguales = true;
		
		System.out.println("Introduce 10 numeros");
		numero= sc.nextInt();
		for (int i = 0; i < 10; i++) 
		{			
			otros=sc.nextInt();
			if(numero!=otros) 
			{
				iguales= false;
			} 
				numero = otros;
		}
			sc.close();
			
			if(iguales)
			{
				System.out.println("Son iguales");
			}
			else 
			{
				System.out.println("No son iguales");
			}
			
		}
	}


