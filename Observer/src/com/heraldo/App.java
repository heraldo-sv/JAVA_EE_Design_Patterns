package com.heraldo;

import com.heraldo.observer.PesoARGObservador;
import com.heraldo.observer.PesoMXObservador;
import com.heraldo.observer.SolObservador;
import com.heraldo.observer.Subject;

public class App {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 dólares obtendrá : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dólares obtendrá : ");
		subject.setEstado(100);
	}
}
