package main;

import java.io.*;

import ac.cr.cenfotec.IExamen.*;

public class main {

	static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	static PrintStream out = System.out;
	
	public static void main(String[] args) throws Exception {
		
		Naipe n = new Naipe();
		
		boolean continuar = true;
		int jugadores = -1;
		
		System.out.println("BIENVENIDO A JUGAR");
		
		while (continuar == true){	
		Mesa m = new Mesa();
		
		while(true) {
			try {
				out.println("Cuantos jugadores van a jugar? Recuerde que no pueden ser mas de 4"); 
				jugadores = (Integer.parseInt(in.readLine ()));
				boolean jugador = m.agregarJugador(jugadores);
				if(!jugador) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e1) {
				out.println("Recuerde solo ingresar numeros del 1 al 4\n");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		int opcion = -1;	
			try{
				out.println("Ingrese:\n"
						+ "1) Si desea jugar 21.\n"
						+ "2) Si desea jugar ron.\n"
						+ "3) Si desea salir del programa.");
				opcion = (Integer.parseInt(in.readLine ()));
			
			}catch(NumberFormatException e){
				out.println("Recuerde solo ingresar numeros\n");
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			switch (opcion){
			case 1:
				m.EmpezarAJugar21();
				break;
				
			case 2: 
				System.out.println("La opcion de jugar ron no se encuentra disponible pero si estan las pruebas.\n");
				break;
				
			case 3:
				continuar = false;
				out.println("Gracias por utilizar el programa.");
				
				break;

			default:
				out.println("Ingrese una de las opciones.");
				break;
			}
		}
	}

		
}



