package objetos;

public class Amuleto extends Elemento {

	Elemento personaje;

	public Amuleto(Elemento pPersonaje) {

		this.personaje = pPersonaje;

	}

	@Override
	public String getNombre() {
		return this.personaje.getNombre() + " con Amuleto";
	}

	@Override
	public int vida() {
		return this.personaje.vida();
	}

	@Override
	public int ataque() {
		return this.personaje.ataque();
	}

	@Override
	public int defensa() {
		return this.personaje.defensa();
	}

	@Override
	public int magia() {
		return 10 + this.personaje.magia();
	}

}
