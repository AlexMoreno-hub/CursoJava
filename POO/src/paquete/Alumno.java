package paquete;

public class Alumno {

	//Campos o propiedades
	public String nombre;
	public String apellido1;
	public String apellido2;
	
	///El THIS se utiliza para los campos/propiedades de la clase
	
	
	//Constructor vacio
	public Alumno() {
		
	}
	//Constructor
	public Alumno(String nombre, String Apellido1, String Apellido2) {
		
		this.nombre = nombre;
		this.apellido1= Apellido1;
		this.apellido2= Apellido2;
		
	}
	
	//Métodos
	
	public void mostrar() {
		
		System.out.println("El alumno se llama " + this.nombre + "  " + this.apellido1 + " " + this.apellido2);
	}
	
	
}
