package datosPersonajes;

import Personajes.Trabajador;
import objetos.Armadura;
import objetos.Escudo;
import objetos.Espada;

public class DatosTrabajador {

	public void datosTrabajador() {

		Trabajador trabajador = new Trabajador();

		Espada espadaTrabajador = new Espada(trabajador);
		Armadura armaduraTrabajador = new Armadura(trabajador);
		Escudo escudoTrabajador = new Escudo(trabajador);

		System.out.println("\nTrabajadores:\n");
		System.out.println(trabajador.getNombre() + ": Vida: " + trabajador.vida() + ". Ataque: " + trabajador.ataque() + ". Defensa: " + trabajador.defensa() + ". Magia: " + trabajador.magia());
		System.out.println(espadaTrabajador.getNombre() + ": Vida: " + espadaTrabajador.vida() + ". Ataque: " + espadaTrabajador.ataque() + ". Defensa: " + espadaTrabajador.defensa() + ". Magia: " + espadaTrabajador.magia());
		System.out.println(armaduraTrabajador.getNombre() + ": Vida: " + armaduraTrabajador.vida() + ". Ataque: " + armaduraTrabajador.ataque() + ". Defensa: " + armaduraTrabajador.defensa() + ". Magia: " + armaduraTrabajador.magia());
		System.out.println(escudoTrabajador.getNombre() + ": Vida: " + escudoTrabajador.vida() + ". Ataque: " + escudoTrabajador.ataque() + ". Defensa: " + escudoTrabajador.defensa() + ". Magia: " + escudoTrabajador.magia());

	}

}
