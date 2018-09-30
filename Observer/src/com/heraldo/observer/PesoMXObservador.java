package com.heraldo.observer;

public class PesoMXObservador extends Observer {
	
	private double valorCambio = 19.07;
	
	public PesoMXObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("MX: " + (sujeto.getEstado() * valorCambio));
	}

}
