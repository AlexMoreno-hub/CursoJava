package clases;

public class Vehiculo {

	
	public Vehiculo() {	
	}
	public Vehiculo(String tipo, int peso, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
	}
	
	public String tipo;
	public int peso;
	public String color;
	
	@Override
	public String toString() {
		return "Vehiculo [tipo=" + tipo + ", peso=" + peso + ", color=" + color + "]";
	}

	
	
}
