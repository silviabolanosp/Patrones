package objetos;

import decorador.Elemento;

public class Escudo extends Elemento {

	Elemento personaje;

	public Escudo(Elemento pPersonaje) {

		this.personaje = pPersonaje;

	}

	@Override
	public String getNombre() {
		return this.personaje.getNombre() + " con Escudo";
	}

	@Override
	public int vida() {
		return 10 + this.personaje.vida();
	}

	@Override
	public int ataque() {
		return this.personaje.ataque();
	}

	@Override
	public int defensa() {
		return 40 + this.personaje.defensa();
	}

	@Override
	public int magia() {
		return this.personaje.magia();
	}

}
