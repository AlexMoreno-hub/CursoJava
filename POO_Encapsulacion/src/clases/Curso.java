package clases;

public class Curso {
	
	//Campos
	
	private String denominacion;
	private int horas;
	private String academia;

	public void curso() {
		
		setDenominacion("");
		setHoras(0);
		setAcademia(" ");
	}
	
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getAcademia() {
		return academia;
	}
	public void setAcademia(String academia) {
		this.academia = academia;
	}
	

	
}
