package com.heraldo;

import com.heraldo.dao.CRUD;
import com.heraldo.dao.PersonaDAOImpl;
import com.heraldo.model.Persona;

public class App {
	
	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
		
		Persona per = new Persona();
		per.setNombres("Heraldo");
		dao.registrar(per);
	}

}