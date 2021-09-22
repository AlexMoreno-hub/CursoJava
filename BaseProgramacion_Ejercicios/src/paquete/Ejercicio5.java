package paquete;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero;
		boolean primo = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intro. numero: ");
		numero = sc.nextInt();
		
		if(numero==1)
		{
			primo = false;
		}
		else
		{
			for(int candidatoDivisor = 2; candidatoDivisor<numero && primo==true; candidatoDivisor++)
			{
				if(numero%candidatoDivisor==0)
				{
					primo = false;
				}
			}
			
			if(primo)
			{
				System.out.println("Es primo");	
			}
			else
			{
				System.out.println("No es primo");
			}			
		}
	}


	}


