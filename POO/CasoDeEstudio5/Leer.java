/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LeydiSantiago
 */
public class Leer {
    public static void main (String [] arsg){
        File archivo;//variable para manipular al archivo 
        FileReader leer;//variable para leer
        String cadena;//variable para las cadenas
        archivo= new File ("leer.txt");
        try {
            leer = new FileReader("leer.txt");
            BufferedReader almacena = new BufferedReader (leer);
            cadena = "";
            while(cadena!=null){
                try {
                    cadena= almacena.readLine();
                    if(cadena!=null){
                        System.out.println(cadena);
                    }
                } catch (IOException ex) {
                    ex.getMessage();
                }
            }
            try {
                almacena.close();//cada que cerremos, abrimos etc se necesita un try catch
                leer.close();
            } catch (IOException ex) {
               ex.getMessage();
            }
        } catch (FileNotFoundException ex) {//excepcion que puede ocurrir cuando se trabaja con archivos 
            ex.getMessage();
        }
    }
}
