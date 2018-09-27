package com.heraldo;

import com.heraldo.decorator.BlindajeDecorador;
import com.heraldo.inter.ICuentaBancaria;
import com.heraldo.inter.impl.CuentaAhorro;
import com.heraldo.model.Cuenta;

public class App {
	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "HeraldoDelValle");	
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}
}
