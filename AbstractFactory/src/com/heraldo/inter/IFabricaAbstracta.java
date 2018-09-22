package com.heraldo.inter;

public interface IFabricaAbstracta {
	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
}