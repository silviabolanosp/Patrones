package main;

import datosPersonajes.DatosGuerrero;
import datosPersonajes.DatosMago;
import datosPersonajes.DatosTrabajador;

public class UI {

	public static void main(String[] args) {

		datosMagos();
		datosG();
		datosT();

	}

	public static void datosMagos() {

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
