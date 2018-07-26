package datosPersonajes;

import Personajes.Mago;
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

		System.out.println("\nMagos:\n");
		System.out.println(mago.getNombre() + ": Vida: " + mago.vida() + ". Ataque: " + mago.ataque() + ". Defensa: " + mago.defensa() + ". Magia: " + mago.magia());
		System.out.println(espadaMago.getNombre() + ": Vida: " + espadaMago.vida() + ". Ataque: " + espadaMago.ataque() + ". Defensa: " + espadaMago.defensa() + ". Magia: " + espadaMago.magia());
		System.out.println(armaduraMago.getNombre() + ": Vida: " + armaduraMago.vida() + ". Ataque: " + armaduraMago.ataque() + ". Defensa: " + armaduraMago.defensa() + ". Magia: " + armaduraMago.magia());
		System.out.println(escudoMago.getNombre() + ": Vida: " + escudoMago.vida() + ". Ataque: " + escudoMago.ataque() + ". Defensa: " + escudoMago.defensa() + ". Magia: " + escudoMago.magia());
		System.out.println(amuletoMago.getNombre() + ": Vida: " + amuletoMago.vida() + ". Ataque: " + amuletoMago.ataque() + ". Defensa: " + amuletoMago.defensa() + ". Magia: " + amuletoMago.magia());


	}
}
