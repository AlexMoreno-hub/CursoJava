package ejecuta;

import clases.Articulo;
import clases.RepoArticulo;

public class Inicio {

	public static void main(String[] args) {

		RepoArticulo repoArticulo = new RepoArticulo();
		Articulo articulo1 = new Articulo("a123","Monitor",300F);
		Articulo articulo2 = new Articulo("a456","Teclado",320F);
		Articulo art;
		
		repoArticulo.nuevo(articulo2);
		repoArticulo.nuevo(articulo1);
		/*
		art= repoArticulo.leer("a456");
		System.out.println(art.toString());*/
		/*
		repoArticulo.eliminar(articulo2);
		*/
		
		art= new Articulo("a456","Teclado",22.5F);
		repoArticulo.editar("a456",art);
		
		art= repoArticulo.leer("a456");
		System.out.println(art.toString());
		
	}

}
