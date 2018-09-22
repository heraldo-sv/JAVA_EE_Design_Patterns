package com.heraldo;

import com.heraldo.inter.IFabricaAbstracta;
import com.heraldo.inter.IConexionBD;
import com.heraldo.inter.IConexionREST;

public class App {

	public static void main(String[] args) {
		IFabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		IFabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://github.com/reicampos/JAVA_EE_Design_Patterns");
	}

}