package paquete;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*2. Programa que lee 3 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que algún número introducido no se encontrara dentro del rango permitido, se
		mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
		se hayan introducido 11 números válidos y mostrará el número máximo introducido de los
		11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
		 */
			int contNumerosValidos = 0;
			int contNumerosNoValidos = 0, numero;
			Scanner sc = new Scanner(System.in);
			int maximo =19;
			int minimo= 41;
			String mensaje;
			
			System.out.println("Introduce 3 numeros entre 20 y 40");
			do 
			{
				numero = sc.nextInt();
				if(numero>=20 && numero <=40)
				{
					contNumerosValidos++;
					
					if(numero> maximo) {
						maximo = numero;
					}
					
					if(numero < minimo) {
						minimo = numero;
					}
				}
				else
				{
					contNumerosNoValidos++;
					System.out.println("Incorrecto, debe estar entre 20 y 40");
				}
				//mientras que
			}while(contNumerosValidos<3);
	

			sc.close();
			
			mensaje= "Mayor: " + maximo + "\n" + "Menor:" + minimo + "\n" + "Cantidad de numeros incorrectos: " + contNumerosNoValidos;
			System.out.println(mensaje);
	

	}
}
