package clases;

import java.util.ArrayList;

import interfaces.ICRUD;

public class GestionCRUD<T1,T2> implements ICRUD<T1,T2> {

	public GestionCRUD() {
		this.listado =  new ArrayList<T1>();
	}
	
	//Campos 
	ArrayList<T1> listado;

	@Override
	public void nuevo(T1 item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(T2 id, T1 item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(T1 item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T1 leer(T2 id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<T1> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
