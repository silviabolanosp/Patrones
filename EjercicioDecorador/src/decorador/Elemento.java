package decorador;

public abstract class Elemento {

	public String nombre = "desconocido";

	public String getNombre() {
		return nombre;
	}

	public abstract int vida();

	public abstract int ataque();

	public abstract int defensa();

	public abstract int magia();

}
