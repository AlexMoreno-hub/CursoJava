package ejecuta;

import clases.Hamster;

public class Inicio {

	public static void main(String[] args) {

		/*Mascota miMascota = new Mascota("Puka",5);
		
		//System.out.println( miMascota.mostrar() );
		
		String texto=miMascota.toString();
		System.out.println(texto);*/
		
		Hamster miHamster1= new Hamster("Marron", "ExtraVital", "Hams", 5);
		Hamster miHamster2= new Hamster();
		
		String texto;
		
		texto= miHamster1.toString();
		
		System.out.println(texto);
		
	}

}
