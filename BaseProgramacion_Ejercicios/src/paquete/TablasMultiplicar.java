package paquete;

import java.util.Random;

public class TablasMultiplicar {

	public static void main(String[] args) {

		//Mostrar las 10 primers tablas de multiplicar
		
		
		int resultado;
		int suma=0;
		for(int numero=1; numero<=10; numero++)
		{	
			System.out.println("Tabla del : " + numero);
			//Inicializamos a 0 para que cada vez que recorra el bucle empieze en 0
			suma=0;
			for(int multiplicado=1;multiplicado<=10;multiplicado++) 
			{
				resultado= numero * multiplicado;
				suma += resultado;
				System.out.println(numero + " X " + multiplicado + " = " + resultado);
				if(multiplicado==10) {
					System.out.println("La suma de todo es : " + suma + "\n" );
				}
			}
			
		}

	}
	
}
