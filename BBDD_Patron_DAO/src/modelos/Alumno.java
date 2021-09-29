package modelos;

public class Alumno {

	public int matricula;
	public String nombre;
	public String apellido;
	

	public Alumno() {
		super();
	}

	public Alumno(int matricula) {
		super();
		this.matricula = matricula;
	}

	public Alumno(int matricula, String nombre, String apellido) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
}
