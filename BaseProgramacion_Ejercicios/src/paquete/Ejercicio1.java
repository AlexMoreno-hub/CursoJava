package paquete;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*Programa que lee dos n�meros A y B, y nos informa si B es divisor de A o no. */
		
		Scanner sc= new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Introduce el 1� numero");
		a=sc.nextInt();
		System.out.println("Introduce el 2� numero");
		b=sc.nextInt();
		
		if(a%b==0)
		{
			System.out.println(b + " es " + " divisor de " + a);
		}
		else
		{
			System.out.println(b + " no es " + " divisor de " + a);
		}
		
		sc.close();//hola
		
	}

}
