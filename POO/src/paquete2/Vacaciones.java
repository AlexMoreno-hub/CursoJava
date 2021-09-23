package paquete2;

public class Vacaciones {

	private int dias;
	private String destino;
	private boolean playa;
	
	public Vacaciones() {
		
	}
	
	public Vacaciones(int dias, String destino, boolean playa) {
		this.dias = dias;
		this.destino = destino;
		this.playa = playa;
	}
	
	public void mostrar() {
		String texto;
		
		texto="Dias" + this.dias + "\n"
				+"destino:" + this.destino + "\n"
				+ "Playa: " + ((this.playa==true)?"Si":"No"); 
		
		System.out.println(texto);
	}
	
	
}
