package clases;

public class Mascota {
	
	private String nombre;
	private int edad;
	
	
	public Mascota() {
		
	}
	
	public Mascota(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//void no devuelve nada
	public void mostrar() {
		System.out.println("El nombre de la mascota es: " + nombre + " y tiene: " + edad + " años");
	}

	@Override
	public String toString() {
		return "Mascota" + "\n" + "nombre: " + nombre + ", edad: " + edad + "";
	}
	
	

}
