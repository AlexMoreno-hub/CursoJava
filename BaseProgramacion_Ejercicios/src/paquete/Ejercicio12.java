package paquete;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		/*Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		número es primo si tiene dos únicos divisores que son el 1 y él mismo*/		
		
		int resto;
		boolean primo ;
		
		for(int numero=2;numero<100;numero++) {
		primo=true;
		
			if(numero<2) {
				primo=false;
			}
			for(int i=2; i<numero && primo==true ;i++) {
			
			resto= numero%i;
			
			if(resto == 0) primo = false;		
			}
		
		String mensaje= "El numero " + numero + " es primo";
		if(primo)
		System.out.println(mensaje);
		}		

		
		}
	}


