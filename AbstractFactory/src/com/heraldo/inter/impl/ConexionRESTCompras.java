package com.heraldo.inter.impl;

import com.heraldo.inter.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {
	@Override
	public void leerURL(String url) {		
		System.out.println("Conectándose a " + url);
	}
}
