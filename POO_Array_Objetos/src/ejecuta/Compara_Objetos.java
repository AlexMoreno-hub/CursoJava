package ejecuta;

import clases.Movil;

public class Compara_Objetos {

	public static void main(String[] args) {

		Movil movilJuan = new Movil(1,4, "Xiaomi", 3);
		Movil movilMaria = new Movil(2,4, "Xiaomi", 3);
		Movil movilPepe = new Movil(3,4, "Xiaomi", 3);
		
		//objetos se comparan con equals
		if(movilJuan.equals(movilMaria)) {
			
		}
	}

}
