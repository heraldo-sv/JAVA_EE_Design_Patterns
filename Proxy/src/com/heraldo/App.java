package com.heraldo;

import com.heraldo.inter.ICuenta;
import com.heraldo.inter.impl.CuentaBancoBImpl;
import com.heraldo.model.Cuenta;
import com.heraldo.proxy.CuentaProxy;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "HeraldoDelValle", 100);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
		
	}

}