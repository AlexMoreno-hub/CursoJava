package repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;



import modelos.Alumno;

public class RepoAlumno extends BaseDatos implements ICRUD<Alumno,Integer>
{

	public RepoAlumno(String servidor, String usuario, String password, String baseDatos) {
		super(servidor, usuario, password, baseDatos);
		// TODO Auto-generated constructor stub
	}

	
	private Alumno alumno;
	private String sql;
	private PreparedStatement ps;
	
	
	
	@Override
	public ArrayList<Alumno> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno leer(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void nuevo(Alumno modelo) throws Exception {
		int cantidad;
		conectar();
		
		this.sql="INSERT INTO Alumno(matricula, nombre, apellido) VALUES(?,?,?)";
		this.ps = conexion.prepareStatement(sql);
		
		this.ps.setInt(1, modelo.matricula);	
		this.ps.setString(2, modelo.nombre);	
		this.ps.setString(3, modelo.apellido);	
		cantidad= this.ps.executeUpdate();
		
		if(cantidad == 1) {
			System.out.println("");
		}else {
			System.out.println("");
		}
	}

	@Override
	public void editar(Integer pk, Alumno modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer pk) {
		// TODO Auto-generated method stub
		
	}

	

}
