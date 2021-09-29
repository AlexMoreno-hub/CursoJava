package clases;

public class Articulo {

	public String referencia;
	public String nombre;
	public float precio;
	
	
	public Articulo() {
	}

	public Articulo(String referencia, String nombre, float precio) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Referencia= " + referencia +"\n" 
				+ "Nombre=" + nombre + "\n" + 
				"Precio:  "+ precio ;
	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		return ((Articulo)obj).referencia.equals(this.referencia);
		//Si fuera int
		//return ((Articulo)obj).precio==precio);
	}
	
	
}
