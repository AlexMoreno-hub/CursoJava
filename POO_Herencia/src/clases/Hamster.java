package clases;

public class Hamster extends Mascota
{

	public String colorPelo;
	public String marcaPienso;
	
	//Constructores
	
	public Hamster() {
		super();
	}
	
	public Hamster(String colorPelo, String marcaPienso, String nombre, int edad) 
	{
		super(nombre,edad);
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;

	}
		//Redefinimos el ToString
	
	@Override
	public String toString() {
		
		String texto;
		texto= super.toString() 
				+ " Color de pelo:" + colorPelo 
				+ " Pienso: " + marcaPienso;
		
		return texto;
	}
}
