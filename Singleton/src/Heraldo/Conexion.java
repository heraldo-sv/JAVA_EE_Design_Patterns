package Heraldo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	Connection conn;

	// >> Variable de tipo clase
	private static Conexion instancia;
	
	// >> Constructor privado para evitar instancias 
	private Conexion() {
		 // TODO Auto-generated constructor stub
		System.out.println("-------- Oracle JDBC prueba de conexión --------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("¿Dónde está ubicado el controlador Oracle JDBC?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registrado!");
        
	}
	
	public static Conexion getInstancia() {
		if(instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}
	
	public void conectar() {
		
		this.conn = null;
		
		try {

			this.conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "heraldo");

        } catch (SQLException e) {

            System.out.println("¡La conexión falló! Verificar consola de salida");
            e.printStackTrace();
            return;

        }
        
        if (this.conn != null) {
            System.out.println("¡Lo lograste, toma el control de tu base de datos ahora!");
        } else {
            System.out.println("¡Fallo al hacer la conexión!");
        } 
	}
	
	public void desconectar() {
		try {
			this.conn.close();
			System.out.println("¡Lo lograste, la desconexión fue exitosa!");
		} catch (SQLException e) {
			System.out.println("¡Fallo al hacer la desconexión!");
			e.printStackTrace();
		}
	}
	
	public Statement getStatement() {
		 
	     Statement stmt = null;
		try {
			stmt = this.conn.createStatement();
			System.out.println("el objeto statement fue creado con éxito");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No se pudo crear el objeto statement");
		}
	     return stmt;
	}
}
