package decorador;

public class Guerrero extends Elemento {

	public Guerrero() {

		this.nombre = "Guerrero";
	}

	@Override
	public int vida() {
		return 20;
	}

	@Override
	public int ataque() {
		return 30;
	}

	@Override
	public int defensa() {
		return 30;
	}

	@Override
	public int magia() {
		return 20;
	}

}
