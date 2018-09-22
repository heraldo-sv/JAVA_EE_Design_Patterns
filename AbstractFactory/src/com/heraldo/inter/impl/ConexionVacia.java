package com.heraldo.inter.impl;

import com.heraldo.inter.IConexionBD;

public class ConexionVacia implements IConexionBD {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}
}
