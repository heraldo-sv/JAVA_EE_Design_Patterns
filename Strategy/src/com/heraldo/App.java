package com.heraldo;

import com.heraldo.strategy.AntivirusAvanzado;
import com.heraldo.strategy.Contexto;

public class App {
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}
}
