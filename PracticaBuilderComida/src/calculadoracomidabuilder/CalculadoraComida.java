/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomidabuilder;

import calculadoracomida.Medida;
import calculadoracomidabuilder.InformacionComida.InformacionComidaBuilder;

/**
 *
 * @author maguero
 */
public class CalculadoraComida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	InformacionComida infoComida;
    	InformacionComidaBuilder builder = new InformacionComida.InformacionComidaBuilder("Comida", Medida.G);
    	builder = builder.calorias(100).cantidadPorcion(2).carbohidratos(3).grasa(4).porciones(5).sodio(6); 
    	infoComida = builder.calculadoraComida();
    	System.out.println(infoComida.toString());
    }
    
}
