package clases;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.ICRUD;

public class RepoArticulo  implements ICRUD<Articulo, String>
{
	//Campos
	
	public ArrayList<Articulo> listado;

	public RepoArticulo() {		
		this.listado= new ArrayList<Articulo>();
	}
	

	@Override
	public void nuevo(Articulo clase) {
		listado.add(clase);
	}
	
	@Override
	public Articulo leer(String id) {

		Articulo articulo=null;
		
		for(int i=0; i<listado.size();i++)
		{
			articulo= listado.get(i);
			
			if(articulo.referencia.equals(id)== true) 
			{
				break;
			}
		}
		
		
		return articulo;
	}
	
	@Override
	public ArrayList<Articulo> listar() {
		return listado;
	}
	
	@Override
	public void eliminar(Articulo clase) {
		
	/*	boolean ok;
		ok= listado.remove(clase);
		if(ok == true) {
		System.out.println("eliminado");
		}
		else {
			System.out.println("No encontrado");
		}*/
		
		Articulo articulo;
		boolean ok= false;
		for(int i=0; i<listado.size();i++) 
		
		{
			articulo = listado.get(i);
		
			if (articulo.referencia.equals(clase.referencia)== true)
			{
				listado.remove(i);
				ok= true;
				break;
			}
		}
		
		if(ok == true) 
		{
		System.out.println("Eliminado");	
		}
		else
		{
		System.out.println("No eliminado");	
		}	
	}
	
	@Override
	public void editar(String id, Articulo clase) 
	{
		Articulo articulo;
		boolean ok= false;
		for(int i=0; i<listado.size();i++) 
		{
			articulo= listado.get(i);
			
			if(articulo.referencia.equals(id)== true) 
			{
				listado.set(i, clase);
				ok=true;
				break;
			}
		}
		if(ok==true)
		{
		System.out.println("Modificado");	
		}else{
			System.out.println("No mofidicado");
		}
		
		}


	@Override
	public HashMap<String, Articulo> listar2() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void eliminar2(String id) {
		// TODO Auto-generated method stub
		
	}

}
