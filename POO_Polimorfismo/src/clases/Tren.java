package clases;

public class Tren extends Vehiculo {

	public int vagones;
	public boolean largoRecorrido;
	

	public Tren() {
	}

	public Tren(String tipo, int peso, String color, int vagones, boolean largoRecorrido) {
		super(tipo, peso, color);
		this.vagones = vagones;
		this.largoRecorrido = largoRecorrido;
	}

	@Override
	public String toString() {
		return super.toString() + "Tren [vagones=" + vagones + ", largoRecorrido=" + largoRecorrido + "]";
	}
	
	
}
