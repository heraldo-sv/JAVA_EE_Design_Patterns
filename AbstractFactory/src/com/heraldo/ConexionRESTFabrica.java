package com.heraldo;

import com.heraldo.inter.IFabricaAbstracta;
import com.heraldo.inter.IConexionBD;
import com.heraldo.inter.IConexionREST;
import com.heraldo.inter.impl.ConexionRESTCompras;
import com.heraldo.inter.impl.ConexionRESTNoArea;
import com.heraldo.inter.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements IFabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}