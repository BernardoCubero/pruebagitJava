package projet;
/**
 * Programa para para Gestioar un videClub
 * 
 * @author HatemHamdi
 * 
 * @version 1.0
 *  
 * @since 2016
 * 
 * @param connection  para la conexion con la base de datos
 * 
 * @throws SQLException contralar errores de la base de datos en sus conexcion
 * 
 **/



import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static Connection connection = null;
	public static Connection connect()
	{
		try {
			Class.forName("org.sqlite.JDBC");
			connection  = DriverManager.getConnection("jdbc:sqlite:bd_projet1.sqlite");
		
	
		} catch (Exception e) {
			e.printStackTrace();
		}
return connection;
	}
		
	public static void main(String[] args) {

	connect();

		new Design().setVisible(true);
		
	}

}
