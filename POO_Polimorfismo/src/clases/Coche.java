package clases;

public class Coche extends Vehiculo
{

	public boolean camara;
	//public String combustible;
	public Combustible combustible;
	
	public Coche() {
		
	}
	

	public Coche(boolean camara, Combustible combustible,String tipo, int peso, String color) {
		super(tipo, peso, color);
		this.camara = camara;
		this.combustible = combustible;
	}


	@Override
	public String toString() {
		return super.toString() + "Coche [camara=" + ((camara == true)?"Si":"No") + "\n" + ", combustible=" + combustible + "]";
	}




	
	
	//Métodos
	
	
}
