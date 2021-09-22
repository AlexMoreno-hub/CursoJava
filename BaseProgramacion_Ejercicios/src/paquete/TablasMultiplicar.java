package paquete;

import java.util.Random;

public class TablasMultiplicar {

	public static void main(String[] args) {

		//Mostrar las 10 primers tablas de multiplicar
		
		
		int resultado;
		
		for(int numero=1; numero<=10; numero++)
		{	
			for(int multiplicado=1;multiplicado<=10;multiplicado++) 
			{
				resultado= numero * multiplicado;
				System.out.println(numero + " X " + multiplicado + " = " + resultado);
				if(multiplicado==10) {
					System.out.println();
				}
			}
			
		}

	}
	
}
