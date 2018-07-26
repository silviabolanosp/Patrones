package datosPersonajes;

import Personajes.Guerrero;
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

		System.out.println("\nGuerreros:\n");
		System.out.println(guerrero.getNombre() + ": Vida: " + guerrero.vida() + ". Ataque: " + guerrero.ataque() + ". Defensa: " + guerrero.defensa() + ". Magia: " + guerrero.magia());
		System.out.println(espadaGuerrero.getNombre() + ": Vida: " + espadaGuerrero.vida() + ". Ataque: " + espadaGuerrero.ataque() + ". Defensa: " + espadaGuerrero.defensa() + ". Magia: " + espadaGuerrero.magia());
		System.out.println(armaduraGuerrero.getNombre() + ": Vida: " + armaduraGuerrero.vida() + ". Ataque: " + armaduraGuerrero.ataque() + ". Defensa: " + armaduraGuerrero.defensa() + ". Magia: " + armaduraGuerrero.magia());
		System.out.println(escudoGuerrero.getNombre() + ": Vida: " + escudoGuerrero.vida() + ". Ataque: " + escudoGuerrero.ataque() + ". Defensa: " + escudoGuerrero.defensa() + ". Magia: " + escudoGuerrero.magia());
		System.out.println(amuletoGuerrero.getNombre() + ": Vida: " + amuletoGuerrero.vida() + ". Ataque: " + amuletoGuerrero.ataque() + ". Defensa: " + amuletoGuerrero.defensa() + ". Magia: " + amuletoGuerrero.magia());

	}

}
