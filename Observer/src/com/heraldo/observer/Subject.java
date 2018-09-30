package com.heraldo.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observadores = new ArrayList<Observer>();
	private int estado;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}

	public void agregar(Observer observador) {
		observadores.add(observador);
	}

	public void notificarTodosObservadores() {
		observadores.forEach(x -> x.actualizar());
	}
}
