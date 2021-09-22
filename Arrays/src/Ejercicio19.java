import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		/*19. Realiza un programa que lea desde teclado 10 números y posteriormente muestre
		solamente los que sean pares.*/
		
		int n = 10;
		//array de numeros ; le
		int numeros[]=new int[n];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro. " + n + " numeros: ");
		
		//rellenamos el array
		for(int i=0; i<n;  i++)
		{
			numeros[i] = sc.nextInt();  
		}
		sc.close();
		
		//recorremos el array
		System.out.println("Los numeros pares son:");
		for(int i=0; i<n; i++)
		{
			if(numeros[i]%2==0)
			{
				System.out.println(numeros[i]);				
			}
		}
		
		//Emleamos el metodo toString de la clase Arrays y le pasamos como valor la variable del array
		//Nos devuelve una cadena de texto con el contenido del array
		String contenidoArray = Arrays.toString(numeros);
		System.out.println(contenidoArray);
	}

}
