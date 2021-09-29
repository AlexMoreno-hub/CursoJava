package clases;

public class Alumno {

	public int matricula;
	public String nombre;
	
	public Alumno(int matricula, String nombre) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
	}

	public Alumno(int matricula) {
		this.matricula= matricula;
	}
	public Alumno() {
		
	}
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		
		return ((Alumno)obj).matricula == this.matricula;
		
	}
	

}
