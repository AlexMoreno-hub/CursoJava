package interfaces;

import java.util.ArrayList;

public interface ICRUD<T1,T2>
{
	//T1 ES EL TIPO DE DATOS DEL OBJETO, por ejemplo Alumno
	//T2 ES EL TIPO DE DATOS DEL CAMPO DEL OBJETO QUE LO IDENTIFICA COMO ÚNICO. En una BDD sería la PK
	
	void nuevo(T1 item);
	void editar(T2 id, T1 item);
	void eliminar(T1 item);
	
	T1 leer(T2 id);
	ArrayList<T1> listar();
}
