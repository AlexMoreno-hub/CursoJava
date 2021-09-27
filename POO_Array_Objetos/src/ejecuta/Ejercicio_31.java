package ejecuta;

import java.util.Scanner;

public class Ejercicio_31 {

	public static void main(String[] args) {

		/*
		 31. Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		3.- Eliminar todos los números.
		4.- Salir.
		 */

	
		String  menu;
		Scanner sc= new Scanner(System.in);
		int [] numeros = new int [18];
		int opcion;
		int num;
		int i=0;
		int j;
		int contIntercambiado;
		int auxiliar;
		
		menu = "--MENÚ--\n" 
				+ "1.- Introducir número entero.\r\n"
				+ "		2.- Listar números.\r\n"
				+ "		3.- Eliminar número.\r\n"
				+ "		3.- Eliminar todos los números.\r\n"
				+ "		4.- Salir.\n";
		do {
			
			System.out.println(menu);
			System.out.println("Introduce opción");
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1: 
				//Comprobamos
				if(i==18) {
					System.out.println("Array lleno.No se ha guardado");
				}
				else {
					
					//pedimos el nº
				System.out.println("Introduce numero: ");
				num= sc.nextInt();
				
				//Comprobamos que nó esta repetido
				for(j=0; j<i && numeros[j]!=num; j++);
					
					//..Si no está repetido se añade en el array
					if(i==j) 
					{
						numeros[i]= num;
						i++;
						//ordenamos ascendentemente los elementos dela array
						//utilizando el algoritmo de la burbuja
						
						do 
						{
							contIntercambiado=0;
							
							//Recorremos el array desde el principio hasta el penúltimo elemento
							for(j=0; j<i-1;j++)
							{
								//si el nº de la posición actual es mayor que el siguiente, se intercambian
								if(numeros[j] > numeros[j+1]){
									auxiliar= numeros[j];
									numeros[j]=numeros[j+1];
									numeros[j+1] = auxiliar;
									
									//incrementamos el contador de intercambios
									contIntercambiado++;
								}
							}
						} while(contIntercambiado>0);
					}
					//... si está repetido, informamos al usuario y no se añade
					else
					{
						System.out.println("Número repetido. No se ha guardado el array");
					}
				}
			break;
			case 2: 
				if(i==0) {
					System.out.println("Sin datos");
				}
				else 
				{
					System.out.println("Contenido del array: ");
					for(j=0; j<i; j++) System.out.println(numeros[j]);
				}
				break;
			
			case 3: 
				
				System.out.print("Introduzca numero: ");
				num = sc.nextInt();
				
				for(j=0; j<i && numeros[j]!=num; j++);
			
				if(i==j) {
					System.out.println("No encontrado no se ha eliminado");
				}
				else {
					for(int k=j; k<i-1;k++) {
						numeros[k] = numeros[k+1];	
				}
					//decrementamos en una unidad la variable i,
					//puesto que hemos eliminado un elemento
					i--;
				}
				
			break;	
			
			case 4: 
				i=0;

				//numeros= new int[18];
			break;	

			case 5: 
			break;	
			default:
				System.out.println(" ");
			break;
			}
		}while(opcion!=5);
	
	}	
}
