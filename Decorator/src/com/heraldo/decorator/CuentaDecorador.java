package com.heraldo.decorator;

import com.heraldo.inter.ICuentaBancaria;
import com.heraldo.model.Cuenta;

public class CuentaDecorador implements ICuentaBancaria {

	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}

}
