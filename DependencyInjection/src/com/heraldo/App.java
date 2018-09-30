package com.heraldo;

import com.heraldo.dao.ConexionMySQL;
import com.heraldo.dao.ConexionPostgre;
import com.heraldo.dao.IConexion;
import com.heraldo.dao.PersonaDAO;
import com.heraldo.dao.PersonaDAOImpl;

public class App {

	public static void main(String[] args) {
		IConexion cx1 = new ConexionMySQL("heraldo", "7482", "localhost");				
		
		IConexion cx2 = new ConexionPostgre("heraldo", "7482", "192.168.1.1");
		
		PersonaDAO dao = new PersonaDAOImpl();
		dao.setConexion(cx1);
		
		dao.listarTodos();
		
		PersonaDAO dao2 = new PersonaDAOImpl();
		dao2.setConexion(cx2);
		
		dao2.listarTodos();
		
	}
}