package clases;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.ICRUD;

public class RepoAlumno implements ICRUD<Alumno, Integer>{

	public HashMap<Integer, Alumno> listado;

	public RepoAlumno() {
		listado =  new HashMap<Integer, Alumno>();
	}

	@Override
	public void nuevo(Alumno clase) {

		this.listado.put(clase.matricula, clase);
	}

	@Override
	public Alumno leer(Integer id) {

		Alumno alumno= this.listado.get(id);
		return alumno;
	}

	@Override
	public ArrayList<Alumno> listar() {

		return null;
	}

	@Override
	public void editar(Integer id, Alumno clase) {
		
		this.listado.put(id, clase);
		
	}

	@Override
	public void eliminar(Alumno clase) {
	}

	@Override
	public HashMap<Integer, Alumno> listar2() {
		// TODO Auto-generated method stub
		return this.listado;
	}

	@Override
	public void eliminar2(Integer id) {
		this.listado.remove(id);
		
	}


	
	
	
}
