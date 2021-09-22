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
		
		if (numero<2) {
			primo = false;
		}
		for(int i=2; i<numero && primo==true ;i++) {
			
			resto= numero%i;
			
			if(resto == 0) primo = false;		
		}
		
	
		String mensaje= (primo) ? "Es primo" : "No es primo";
		
		System.out.println(mensaje);
		
		sc.close();
		
		}
	}


