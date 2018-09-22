package com.heraldo;

import com.heraldo.inter.IFabricaAbstracta;
import com.heraldo.inter.IConexionBD;
import com.heraldo.inter.IConexionREST;
import com.heraldo.inter.impl.ConexionMySQL;
import com.heraldo.inter.impl.ConexionOracle;
import com.heraldo.inter.impl.ConexionPostgreSQL;
import com.heraldo.inter.impl.ConexionSQLServer;
import com.heraldo.inter.impl.ConexionVacia;

public class ConexionBDFabrica implements IFabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}