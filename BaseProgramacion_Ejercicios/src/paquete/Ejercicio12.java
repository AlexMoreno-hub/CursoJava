package paquete;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		/*Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		número es primo si tiene dos únicos divisores que son el 1 y él mismo*/
		
		
		int numero;
		int resto;
		Scanner sc= new Scanner(System.in);
		boolean primo = true;
		
		System.out.println("Introduce numero");
		numero=sc.nextInt();
		
		for(int i=2; i<numero && primo==true ;i++) {
			
			resto= numero%i;
			
			if(resto == 0) {
				primo = false;		
			}
		}
			if(primo == true) {
				System.out.println("Es primo");
			}
			else {
				System.out.println("No es primo");
			}
		
		}
	}


