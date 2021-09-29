package repositorios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos 
{
	//Constructores
	
	public BaseDatos(String servidor,String usuario,String password, String baseDatos) {
		this.cadenaConexion = "jdbc:mysql://" + servidor + "/" + baseDatos 
				   + "?user=" + usuario + "&password=" + password 
				   + "&autoReconnect=true";

	}
	
	//campos
	public Connection conexion; 
	private String cadenaConexion;
	
	//Metodos
	
	public void conectar() throws Exception {
		this.conexion = DriverManager.getConnection(this.cadenaConexion);
		System.out.println("Conectado");
		//return conexion;
	}
	
	public void desconectar() throws Exception {
		if(this.conexion!=null && this.conexion.isClosed()== false)
		{
			this.conexion.close();
		}
		
	}
}
