package objetos;

import decorador.Elemento;

public class Armadura extends Elemento {

	Elemento personaje;

	public Armadura(Elemento pPersonaje) {

		this.personaje = pPersonaje;

	}

	@Override
	public String getNombre() {
		return this.personaje.getNombre() + " con Armadura";
	}

	@Override
	public int vida() {
		return 20 + this.personaje.vida();
	}

	@Override
	public int ataque() {
		return this.personaje.ataque();
	}

	@Override
	public int defensa() {
		return 20 + this.personaje.defensa();
	}

	@Override
	public int magia() {
		return this.personaje.magia();
	}

}
