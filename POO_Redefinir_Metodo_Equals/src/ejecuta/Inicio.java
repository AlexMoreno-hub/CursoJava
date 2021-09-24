package ejecuta;

import java.util.HashMap;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) 
	{

	//	HashMap<Integer, Movil> moviles =  new HashMap<Integer, Movil>();
		
		var moviles= new HashMap<Integer, Movil>();
		
		Movil movilJuan = new Movil(111, 4, "Samsung", 4);
		Movil movilMaria = new Movil(232, 6, "Iphone", 4);
		Movil movilPedro = new Movil(955, 4, "Xiaomi", 5);
	
		moviles.put(111, movilJuan);
		moviles.put(232, movilMaria);
		moviles.put(955, movilPedro);

	}

}
