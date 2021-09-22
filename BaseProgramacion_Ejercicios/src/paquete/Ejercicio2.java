package paquete;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*2. Programa que lee 3 n�meros comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que alg�n n�mero introducido no se encontrara dentro del rango permitido, se
		mostrar� un mensaje de error y seguir� pidiendo n�meros. El programa finalizar� cuando
		se hayan introducido 11 n�meros v�lidos y mostrar� el n�mero m�ximo introducido de los
		11 v�lidos. Adem�s indicar� cu�ntos n�meros de los introducidos no han sido v�lidos.
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
