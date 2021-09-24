package ejecuta;

import java.util.HashMap;

public class Inicio {

	public static void main(String[] args) 
	{

		//No admite primitivos (int) ; hay que poner Envolvente (Integer)
		//Este HashMap tiene como claves String y como Valor Integer 
		
		HashMap<String, Integer> temperaturasMaxEstacion = new HashMap<String, Integer>();
		
		//se declara con var--> 
		var temperatutasMaxEstacion= new HashMap<String, Integer>();
		int temperatura;
		//inicializar
		temperaturasMaxEstacion.put("Otoño", 20);
		temperaturasMaxEstacion.put("Invierno", 10);
		temperaturasMaxEstacion.put("Primavera", 15);
		temperaturasMaxEstacion.put("Verano", 40);
		
		temperatura= temperaturasMaxEstacion.get("Primavera");
		
		System.out.println("Temperatura max en primavera:" + temperatura);
		
		//Eliminamos el elemento de clave primavera
		//Comprobamo si existe la clave en la coleccion
		if(temperaturasMaxEstacion.containsKey("Primavera") == true) {
		temperaturasMaxEstacion.remove("Primavera");
		System.out.println("Eliminado");
		}else
		{
			System.out.println("NO existe el elemento");
		}
		
		//Comprobamos si un valor se encuentra en la coleccion
		if(temperaturasMaxEstacion.containsValue(10) == true) {
			System.out.println("Valor encontroado en la coleccion");
		}else {
			System.out.println("El valor no se encuentra en la coleccion");
		}
		
		
		
		//Modificamos el elemnto de la clave verano
		temperaturasMaxEstacion.put("Verano", 42);		
		//Recorremos la COLECCION
		
		//Ejemplo de bucle foreach
		for(String clave : temperaturasMaxEstacion.keySet()) 
		{
			temperatura= temperaturasMaxEstacion.get(clave);
			
			System.out.println("La temperatura max en : " + clave + " es de: " + temperatura + " grados");
		}
		
	
	}

}
