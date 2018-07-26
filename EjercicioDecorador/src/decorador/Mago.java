package decorador;

public class Mago extends Elemento {

	public Mago() {
		this.nombre = "Mago";
	}

	@Override
	public int vida() {
		return 8;
	}

	@Override
	public int ataque() {
		return 15;
	}

	@Override
	public int defensa() {
		return 15;
	}

	@Override
	public int magia() {
		return 40;
	}

}
