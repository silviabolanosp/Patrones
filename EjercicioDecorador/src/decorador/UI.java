package decorador;

import datosPersonajes.DatosGuerrero;
import datosPersonajes.DatosMago;
import datosPersonajes.DatosTrabajador;

public class UI {

	public static void main(String[] args) {

		datosM();
		datosG();
		datosT();

	}

	public static void datosM() {

		DatosMago DM = new DatosMago();

		DM.datosMago();

	}

	public static void datosG() {

		DatosGuerrero DG = new DatosGuerrero();

		DG.datosGuerrero();

	}

	public static void datosT() {

		DatosTrabajador DT = new DatosTrabajador();

		DT.datosTrabajador();

	}

}
