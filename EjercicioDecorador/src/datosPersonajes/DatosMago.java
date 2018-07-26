package datosPersonajes;

import decorador.Mago;
import objetos.Amuleto;
import objetos.Armadura;
import objetos.Escudo;
import objetos.Espada;

public class DatosMago {

	public void datosMago() {
		Mago mago = new Mago();

		Espada espadaMago = new Espada(mago);
		Armadura armaduraMago = new Armadura(mago);
		Escudo escudoMago = new Escudo(mago);
		Amuleto amuletoMago = new Amuleto(mago);

		System.out.println("Mago:");
		System.out.println();

		System.out.println("Tenemos un " + mago.getNombre() + " que tiene de vida: " + mago.vida()
				+ ", de ataque: " + mago.ataque() + ", de defensa: " + mago.defensa() + ", de magia: "
				+ mago.magia());

		System.out.println("Tenemos un " + espadaMago.getNombre() + " que tiene de vida: " + espadaMago.vida()
				+ ", de ataque: " + espadaMago.ataque() + ", de defensa: " + espadaMago.defensa()
				+ ", de magia: " + espadaMago.magia());

		System.out.println("Tenemos un " + armaduraMago.getNombre() + " que tiene de vida: " + armaduraMago.vida()
				+ ", de ataque: " + armaduraMago.ataque() + ", de defensa: " + armaduraMago.defensa()
				+ ", de magia: " + armaduraMago.magia());

		System.out.println("Tenemos un " + escudoMago.getNombre() + " que tiene de vida: " + escudoMago.vida()
				+ ", de ataque: " + escudoMago.ataque() + ", de defensa: " + escudoMago.defensa()
				+ ", de magia: " + escudoMago.magia());

		System.out.println("Tenemos un " + amuletoMago.getNombre() + " que tiene de vida: " + amuletoMago.vida()
				+ ", de ataque: " + amuletoMago.ataque() + ", de defensa: " + amuletoMago.defensa()
				+ ", de magia: " + amuletoMago.magia());

		System.out.println();
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");

	}
}
