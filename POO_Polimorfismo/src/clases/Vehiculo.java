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

	public void mostrar (Vehiculo v) {
		Tren t;
		Coche c;
		
		if(v instanceof Coche) {
				c = (Coche) v;
				System.out.println(c.toString());
		}else if(v instanceof Tren) {
			t = (Tren) v;
			System.out.println(t.toString());
		}
	}
	
	
}
