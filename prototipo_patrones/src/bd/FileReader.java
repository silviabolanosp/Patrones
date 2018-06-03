package bd;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amanda
 */
public class FileReader {
    //Declaración e inicialización de las variables de entrada y salida de datos.

    static BufferedReader   in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream      out = System.out;

    //Método principal de la aplicación. Muestra el menú con las diferentes opciones.
    public static void main(String args []) throws  java.io.IOException
    {
        int opcion = -1; //variable que almacena la opción que selecciona el usuario del menú.
        do {

                out.println("1.Imprimir todos los caracteres");
                out.println("2.Imprimir lineas");
                out.println("3.Guardar");
                out.println("4.Actuatlizar");
                out.println("5. Salir");
                out.println("Digite la opcion");
                opcion = Integer.parseInt(in.readLine());
                procesarOpcion(opcion);

        }while(opcion !=5);
    }

    /*
      Función que se encarga de administrar la opción seleccionada por el usuario.
      Recibe como parámetro dicha oopción, y ejecuta las acciones necesarias según el valor del 
parámetro.
     */
    public static void procesarOpcion(int pOpcion) throws java.io.IOException
    {
        switch (pOpcion)
        {
            case 1:
                //En esta opción se maneja un ejemplo de un try and catch no procesado en las 
                //fuciones llamadas.
                //En caso de que se produzca un error se muestra un mensaje al usuario.
                try{
                    imprimirCaracteres();
                }
                catch(IOException e)
                {
                    out.println("No se encontró el archivo");
                }

                break;
            case 2:
                imprimirLineas();
                break;
            case 3:
                guardar();
                break;
            case 4:
                actualizar();
                break;

            case 5://el usuario selecciona la opción de salir.
                out.println( "Fin !!");
                break;
            default: // el usuario ingresa un valor que no está dentro de las opciones del menú
                out.println("Opcion inválida");
                break;

        }
    }

    /*Función que se encarga de imprimir los caracteres de los elementos de un archivo.

      La clase Reader implementa, entre otros, los siguientes métodos.
      read(), que lee un único caracter.
      read(char[]) que lee un arreglo de caracteres.
      close(), que cierra el stream.
      La clase FileReader es una clase que se usa para leer archivos de texto, usando el encodig 
del Sistema Operativo.
      VAriables:
      reader, de tipo FileReader.  Reader es una clase abstracta que se usa para leer texto 
(Streams).
      caracter, de tipo entero, que almacena cada uno de los caracteres.
      Esta función maeneja un try and catch que controla la excepción IOException.
      En este caso, lanza (trhow) la excepción en el catch, en lugar de procesarla (presentar el 
mensaje al usuario).
      Es por esta razón, que está marcado, el método, como que lanza una excepción (throwS) de tipo 
IOException en la declaración
     */
    public static void imprimirCaracteres() throws IOException
    {
        try
        {
            java.io.FileReader reader = new java.io.FileReader("Archivos.txt");
            int caracter;
            //el método read() retorna el número del caracter correspondiente que, al imprimirse, 
             //es convertido a texto.
            //En caso de que ya no haya más caracteres, retrona menos uno, de ahí la condición del 
            //while.
            while((caracter = reader.read()) != -1)//se hace un ciclo para leer los caracteres.
            {
                System.out.println((char)caracter);
            }
            reader.close(); //se cierra el reader.
        }
        catch (IOException e)
        {
           throw e;

        }
    }

    /*
     Método que muestra cómo imprimir el contenido de un archivo de texto, línea por línea.
     La clase BufferedReader lee texto de un grupo de caracteres de forma eficiente y brinda un 
método para leer el texto
     línea por línea.
     Variables:
      reader, de tipo FileReader.  Reader es una clase abstracta que se usa para leer texto 
(Streams).
      buffer, de tipo BufferedReader.
      datos, de tipo String, que almacena cada una de las líneas, que luego se imprimien una por 
una.
      Este método tiene un try and catc que valida si hay un IOException, e imprime la pila de 
llamadas, en caso de que
      ocurra un error.
     */
    public static void imprimirLineas()
    {
        try
        {
            java.io.FileReader reader = new java.io.FileReader("Archivo.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String datos;
            //el bufferedReader extrae cada línea, y verrifica si el resultado es nulo. Si es nulo 
             //es que ya llegó al final del texto.
            //De ahi la condición del ciclo while.
            while((datos = buffer.readLine()) != null) // Ciclo que imprime cada una de las lineas, 
            // que se almacenan en la variable datos.
            {
                System.out.println(datos);
            }
            reader.close();//se cierra el reader.
        }
        catch(IOException e)
        {
            e.printStackTrace();//se imprime la pila de llamadas para ver dónde está el error.
        }
    }
    /*
    Función que se encarga de almacenar la información en un archivo de texto. Este método 
reemplaza el contenido del archivo.
    La clase Writer es una clase abstracta para escribir grupos de caracteres.  Implementa los 
siguientes métodos
    write(int) que imprimi un solo caracter.
    write(char[]) que imprime un arreglo de carateres.
    write(String) que imprime un String.
    close(), que cierra el stream.
    La clase OutputStreamWriter es un puente que convierte streams de caracteres en streams de 
bytes.
    Los careactes son codificados usando el charset especificado. El charset puede ser el del 
Sistema Operativo o ser indicado
    (para español es UTF-8.)
    FileWriter es una clase para escribir archivos de texto usando el charset del sistema 
operativo.
    BufferedWriter  escribe texto  en un stream de caracteres de forma eficiente y provee un método 
para  escribir un separador de líneas (newLine)
    Variables
    stream, de tipo FileOutputStream.
    output, de tipo OutputSteamWriter.
    buffer, de tipo BufferedWriter.
    ESte método usa un try and catch, en el que se maneja la excepción IOException, imprimiento la 
pilla de llamadas.
     */
    public static void guardar()
    {
        try {
            FileOutputStream stream = new FileOutputStream("Archivo.txt");
            OutputStreamWriter output = new OutputStreamWriter(stream, "UTF-8");
            //se crea la variable usando en encoding UTF-8, para español.
            BufferedWriter buffer = new BufferedWriter(output);

            buffer.write("Pablo Mármol");//se escribe el nombre
            buffer.newLine();//se pasa a la siguiente línea.
            buffer.write("Pedro Picapiedra");//se escribe el otro nombre.

            buffer.close();//se cierra el Buffered.
        } catch (IOException e) {
            e.printStackTrace();//se imprimie la pila de llamdas.
        }
    }
/*
    Función que se encarga de almacenar la información en un archivo de texto. Este método 
actualiza el contenido del archivo.
    La clase Writer es una clase abstracta para escribir grupos de caracteres.  Implementa los 
siguientes métodos
    write(int) que imprimi un solo caracter.
    write(char[]) que imprime un arreglo de carateres.
    write(String) que imprime un String.
    close(), que cierra el stream.
    La clase OutputStreamWriter es un puente que convierte streams de caracteres en streams de 
bytes.
    Los careactes son codificados usando el charset especificado. El charset puede ser el del 
Sistema Operativo o ser indicado
    (para español es UTF-8.)
    FileWriter es una clase para escribir archivos de texto usando el charset del sistema 
operativo.
    BufferedWriter  escribe texto  en un stream de caracteres de forma eficiente y provee un método 
para  escribir un separador de líneas (newLine)
    Variables
    stream, de tipo FileOutputStream.
    output, de tipo OutputSteamWriter.
    buffer, de tipo BufferedWriter.
    ESte método usa un try and catch, en el que se maneja la excepción IOException, imprimiento la 
pilla de llamadas.
     */

    public static void actualizar()
    {
        try {
            FileWriter writer = new FileWriter("Archivo.txt", true);
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.write("\nVilma Picapiedra");
            buffer.newLine();
            buffer.write("Betty Mármol");

            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
