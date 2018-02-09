

import java.sql.Connection;
import java.sql.Statement;


public class usaBD {

	private static Connection conn = null;
	private static Statement stat = null;
	public usaBD() {
		
	}
	public void inserta(String victoria, int fichasFinalA, int fichasFinalB) {
		if (conn==null) {
			conn = BD.initBD( "estadisticas.bd" );
			stat = BD.usarCrearTablasBD( conn );
		}
		
		BD.partidaInsert(stat, victoria, fichasFinalA, fichasFinalB);
	
	
	
		if (conn!=null) {
			BD.cerrarBD( conn, stat );
		}
	}
	public void selecciona() {
		if (conn==null) {
			conn = BD.initBD( "estadisticas.bd" );
			stat = BD.usarCrearTablasBD( conn );
		}
		
		
	
	
	
		if (conn!=null) {
			BD.cerrarBD( conn, stat );
		}
	}
	
	
	
}
