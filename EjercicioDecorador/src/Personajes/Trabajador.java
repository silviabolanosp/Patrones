package Personajes;

import objetos.Elemento;

public class Trabajador extends Elemento {

	public Trabajador() {

		this.nombre = "Trabajador";

	}

	@Override
	public int vida() {
		return 25;
	}

	@Override
	public int ataque() {
		return 10;
	}

	@Override
	public int defensa() {
		return 10;
	}

	@Override
	public int magia() {
		return 10;
	}

}
