package com.heraldo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.heraldo.inter.Conexion;

public class App {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Conexion con = Conexion.getInstancia();
		con.conectar();
		
        Statement stmt = con.getStatement();
        
        System.out.println("Ejecutar consulta");
        
        ResultSet rs=stmt.executeQuery("SELECT * FROM SPRINGDB.LIBROS");  
        while(rs.next())  
        System.out.println(rs.getInt(1)+",  "+rs.getString(2)+",  "+rs.getString(3)+",  "+rs.getString(4)+",  "+rs.getString(5));
		
		con.desconectar();
		
		boolean rpta = con instanceof Conexion;
		System.out.println(rpta);
		 
		Conexion con2 = Conexion.getInstancia();
		con2.conectar();
		con2.desconectar();
		
		Conexion con3 = Conexion.getInstancia();
		con3.conectar();
		con.desconectar();
	}
}