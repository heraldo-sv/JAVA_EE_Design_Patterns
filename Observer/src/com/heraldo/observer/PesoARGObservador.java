package com.heraldo.observer;

public class PesoARGObservador extends Observer {

	private double valorCambio = 29.86;
	
	public PesoARGObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("ARG: " + (sujeto.getEstado() * valorCambio));
	}

}
