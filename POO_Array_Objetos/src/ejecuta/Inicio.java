package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {

		//Array de movil
		
		/*
		Movil moviles[] = {new Movil(8,"Apple",4),
						   new Movil(10,"Samsung",5),
						   new Movil(12,"Xiomi",4),	
		};*/
	
		Movil moviles[]= new Movil[3];
	
		//Declaramos tres instancias(objetos) de la la clase mmovil 
		Movil m1= new Movil(13542,8,"Apple",4);
		Movil m2= new Movil(54321,10,"Samsung",5);
		Movil m3= new Movil(12345,12,"Xiomi",4);
		
		moviles[0] = m1;
		moviles[1] = m2;
		moviles[2] = m3;
	
		//recorremos el array
		for(int i=0; i<3 ; i++) {

			System.out.println(moviles[i].toString());
		}
		
	}

}
