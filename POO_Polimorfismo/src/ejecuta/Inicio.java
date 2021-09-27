package ejecuta;

import clases.Coche;
import clases.Combustible;
import clases.Tren;
import clases.Vehiculo;


public class Inicio {

	public static void main(String[] args) {

		Vehiculo [] vehiculos = new Vehiculo[2];
		Vehiculo veh;
		 Coche miCoche= new Coche(true, Combustible.gasolina, "coche", 1300, "Verde");
		 Tren miTren= new Tren("tren", 1000, "blanco", 4, false);
		//System.out.println(miCoche.toString());
		// System.out.println(miTren.toString());
	
	//1-Hacemos uso del polimorfismo para almacenar en el array objetos de distinto tipo
		 
		 //Hacemos uso del polimorfismo para almacenar en el array objetos de dsitinto tipo
		 vehiculos[0]= miCoche;
		 vehiculos[1]= miTren;
		 
		 //Recorremos array
		 
		 for(int i=0; i<vehiculos.length; i++) 
		 {
			veh= vehiculos[i];
			
			if(veh instanceof Tren) 
			{
				miTren=(Tren) veh;
				System.out.println(miTren.toString());
				
			}
			else if(veh instanceof Coche) {
				miCoche= (Coche) veh;
				System.out.println(miCoche.toString());
			}
		 }
		 
	//2- Instanciar un objeto de un tipo como otro
		 Vehiculo v= new Tren();
	//3- Paso de parámetros
		 
		 v.mostrar(miTren);
		 v.mostrar(miCoche);
		 
	}

}
