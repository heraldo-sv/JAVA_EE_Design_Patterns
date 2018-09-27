package com.heraldo.inter;

import com.heraldo.model.Cuenta;

public interface ICuenta {
	Cuenta retirarDinero(Cuenta cuenta, double monto);
	Cuenta depositarDinero(Cuenta cuenta, double monto);
	void mostrarSaldo(Cuenta cuenta);
}
