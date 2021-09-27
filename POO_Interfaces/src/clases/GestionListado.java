package clases;

import java.util.ArrayList;

import interfaces.IGestionListado;

public class GestionListado implements IGestionListado{
private int contNumrero = 0;
	//Constructores

	public GestionListado() 
	{
		this.listado= new ArrayList<Integer>();
	}
	
	//Campos
	public ArrayList<Integer> listado;
	
	@Override
	public void nuevo(int numero) {

		if(this.listado.size() == 18)
		{
			System.out.println("No introducido.El listado está lleno");
		}
		else if(this.listado.contains(numero) == true) 
		{
		System.out.println("Ya se encuentra en el listado");	
		}
		else {
			this.listado.add(numero);
			this.listado.sort(null);
		}
	}

	@Override
	public void listar() {

		if(this.listado.size()==0) {
			System.out.println("Listado vacio");
		}
		else {
			for(int i=0; i<this.listado.size(); i++) {
				System.out.println(listado.get(i));
			}
			
		}
	}

	@Override
	public void eliminar(Integer numero) {
		if (listado.remove(numero) == false) {
			System.out.println("El numero se ha eliminado");
		}
	}

	@Override
	public void eliminar() {
		listado.clear();
		//this.listado=  new ArrayList<Integer>();
	}

}
