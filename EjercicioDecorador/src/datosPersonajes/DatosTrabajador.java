package datosPersonajes;

import decorador.Trabajador;
import objetos.Armadura;
import objetos.Escudo;
import objetos.Espada;

public class DatosTrabajador {

	public void datosTrabajador() {

		Trabajador trabajador = new Trabajador();

		Espada espadaTrabajador = new Espada(trabajador);
		Armadura armaduraTrabajador = new Armadura(trabajador);
		Escudo escudoTrabajador = new Escudo(trabajador);

		System.out.println("Trabajador:");
		System.out.println();

		System.out.println("Tenemos un " + trabajador.getNombre() + " que tiene de vida: " + trabajador.vida()
				+ ", de ataque: " + trabajador.ataque() + ", de defensa: " + trabajador.defensa() + ", de magia: "
				+ trabajador.magia());

		System.out.println("Tenemos un " + espadaTrabajador.getNombre() + " que tiene de vida: "
				+ espadaTrabajador.vida() + ", de ataque: " + espadaTrabajador.ataque() + ", de defensa: "
				+ espadaTrabajador.defensa() + ", de magia: " + espadaTrabajador.magia());

		System.out.println("Tenemos un " + armaduraTrabajador.getNombre() + " que tiene de vida: "
				+ armaduraTrabajador.vida() + ", de ataque: " + armaduraTrabajador.ataque() + ", de defensa: "
				+ armaduraTrabajador.defensa() + ", de magia: " + armaduraTrabajador.magia());

		System.out.println("Tenemos un " + escudoTrabajador.getNombre() + " que tiene de vida: "
				+ escudoTrabajador.vida() + ", de ataque: " + escudoTrabajador.ataque() + ", de defensa: "
				+ escudoTrabajador.defensa() + ", de magia: " + escudoTrabajador.magia());

	}

}
