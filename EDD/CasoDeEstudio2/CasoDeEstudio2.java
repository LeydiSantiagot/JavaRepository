/*
Dado un archivo de texto de "n" líneas, recorrerlo de la primera a la última, y por cada una de ellas indicar sí
es un número entero o bien no lo es, al final mostrar la suma de todos los números en el archivo y la
concatenación de los casos contrarios.
 */
package casoDeEstudio2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LeydiSantiago
 */
public class CasoDeEstudio2 {

    //Declarando atributos
    String nombreArchivo;
    String sumaConcatenacion;
    String esNumero;

    //Metodo constructor sin parametros, inicializando variables
    public CasoDeEstudio2() {
        nombreArchivo = "";//Atributo principal
        sumaConcatenacion = "";
        esNumero = "";
    }
    //Metodo constructor con parametros
    public CasoDeEstudio2(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        sumaConcatenacion = "";
        esNumero = "";
    }

    //Metodo para leer archivo 
    public void setEsNumeroSumaConcatenacion() {
        String cadena;
        File archivo;
        FileReader leer;
        int suma;
        String concatenacion;
        BufferedReader almacenamiento;
        //Preparando el archivo
        archivo = new File(nombreArchivo);
        cadena = "";
        suma = 0;
        concatenacion = "";
        try {
            //Instancia de tipo FileReader
            leer = new FileReader(archivo);
            //Instancia tipo Buffered
            almacenamiento = new BufferedReader(leer);
            //Bucle while para el archivo 
            while (cadena != null) {
                try {
                    //Alamacenamos la cadena para leerla
                    cadena = almacenamiento.readLine();
                    //Estructura de control if para que la linea de texto no sea nula 
                    if (cadena != null) {
                        try {
                            //Si mi linea actual se puede convertir a numero quiere decir que es numero 
                            int lineaActual = Integer.parseInt(cadena);
                            suma += lineaActual;
                            esNumero = esNumero + cadena + " si es numero\n";

                        } catch (NumberFormatException e) {
                            //Si mi linea actual no se puede convertir pasa a ser una excepcion y la atrapamos mostrando su concatenacion
                            concatenacion += cadena+" ";
                            esNumero = esNumero + cadena + " no es numero\n";
                        }
                    }
                    //IOException para cualquier excepcion que pueda suceder con el archivo 
                } catch (IOException ex) {
                    System.out.println("Ha ocurrido una exception 'IOException'");
                }
            }

            sumaConcatenacion = "La suma es " + suma + " y la concatenacion es " + concatenacion;
        } catch (FileNotFoundException ex) {
            System.out.println("Ha ocurrido una exception 'FileNotFormatException'");
        }
    }
    //Mostramos e el resultado de la variable esNumero y la sumaConcatenacion
    public void showEsNumeroSumaConcatenacion() {
        System.out.println(esNumero);
        System.out.println(sumaConcatenacion);
    }
}
