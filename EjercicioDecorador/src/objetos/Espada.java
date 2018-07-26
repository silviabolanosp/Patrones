package objetos;

import decorador.DecoradorPersonaje;
import decorador.Elemento;

public class Espada extends Elemento {

	Elemento personaje;

	public Espada(Elemento pPersonaje) {

		this.personaje = pPersonaje;

	}

	@Override
	public String getNombre() {
		return this.personaje.getNombre() + " con Espada";
	}

	@Override
	public int vida() {
		return 1 + this.personaje.vida();
	}

	@Override
	public int ataque() {
		return 10 + this.personaje.ataque();
	}

	@Override
	public int defensa() {
		return 10 + this.personaje.defensa();
	}

	@Override
	public int magia() {
		return this.personaje.magia();
	}

}
