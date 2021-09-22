package paquete;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Intro. numero: ");
		numero = sc.nextInt();
		
		System.out.println("Los divisores de "+numero+" son: ");
		for(int candidatoDivisor=1; candidatoDivisor<=numero/2; candidatoDivisor++)
		{
			if(numero%candidatoDivisor==0)
			{
				System.out.println(candidatoDivisor);
			}
		}
		
		System.out.println("FIN");
		sc.close();
	}

	
}
