package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		
		Alumno alumno1= new Alumno();
		Alumno alumno2= new Alumno("Alex", "Moreno", "Alvarez");
		
		
		alumno1.nombre="Pedro";
		alumno1.apellido1="Martin";
		alumno1.apellido2="Gonzalez";
		
		System.out.println("NOMBRE: " + alumno1.nombre + "\n" +  "1ºApellido: "+ alumno1.apellido1 + "\n" + "2ºApellido:  " + alumno1.apellido2 );
		
		alumno1.mostrar();
		alumno2.mostrar();
		
	}

}
