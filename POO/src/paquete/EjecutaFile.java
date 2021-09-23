package paquete;

import java.io.File;
import java.io.IOException;

public class EjecutaFile {

	public static void main(String[] args) {

		
		//Abrir la calculadora
		try {
			
		
		Runtime.getRuntime().exec("C:\\\\Windows\\\\System32\\\\calc.exe");
	
		}
		catch (IOException e){
			System.out.println("Fichero  no encontrado");
		}
		}

}
