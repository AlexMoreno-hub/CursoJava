package modelos;

public class Alumno 
{
	// Constructores
	public Alumno() {
	}
	public Alumno(int matricula) 
	{
		this.matricula = matricula;
	}
	public Alumno(int matricula, String apellido, String nombre) 
	{
		this.matricula = matricula;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	// Campos
	public int matricula; // PK
	public String apellido;
	public String nombre;
	
	// Métodos
	@Override
	public String toString() {
		return "MATRÍCULA: " + matricula + "\n"
				+ "APELLIDO: " + apellido + "\n"
				+ "NOMBRE: " + nombre + "\n";
	}
}
