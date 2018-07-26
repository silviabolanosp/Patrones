package datosPersonajes;

import decorador.Guerrero;
import objetos.Amuleto;
import objetos.Armadura;
import objetos.Escudo;
import objetos.Espada;

public class DatosGuerrero {

	public void datosGuerrero() {

		Guerrero guerrero = new Guerrero();

		Espada espadaGuerrero = new Espada(guerrero);
		Armadura armaduraGuerrero = new Armadura(guerrero);
		Escudo escudoGuerrero = new Escudo(guerrero);
		Amuleto amuletoGuerrero = new Amuleto(guerrero);

		System.out.println("Guerrero:");
		System.out.println();

		System.out.println("Tenemos un " + guerrero.getNombre() + " que tiene de vida: " + guerrero.vida()
				+ ", de ataque: " + guerrero.ataque() + ", de defensa: " + guerrero.defensa()
				+ ", de magia: " + guerrero.magia());

		System.out.println("Tenemos un " + espadaGuerrero.getNombre() + " que tiene de vida: " + espadaGuerrero.vida()
				+ ", de ataque: " + espadaGuerrero.ataque() + ", de defensa: " + espadaGuerrero.defensa()
				+ ", de magia: " + espadaGuerrero.magia());

		System.out.println("Tenemos un " + armaduraGuerrero.getNombre() + " que tiene de vida: "
				+ armaduraGuerrero.vida() + ", de ataque: " + armaduraGuerrero.ataque() + ", de defensa: "
				+ armaduraGuerrero.defensa() + ", de magia: " + armaduraGuerrero.magia());

		System.out.println("Tenemos un " + escudoGuerrero.getNombre() + " que tiene de vida: " + escudoGuerrero.vida()
				+ ", de ataque: " + escudoGuerrero.ataque() + ", de defensa: " + escudoGuerrero.defensa()
				+ ", de magia: " + escudoGuerrero.magia());

		System.out.println("Tenemos un " + amuletoGuerrero.getNombre() + " que tiene de vida: " + amuletoGuerrero.vida()
				+ ", de ataque: " + amuletoGuerrero.ataque() + ", de defensa: " + amuletoGuerrero.defensa()
				+ ", de magia: " + amuletoGuerrero.magia());

		System.out.println();
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");

	}

}
