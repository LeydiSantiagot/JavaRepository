/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LeydiSantiago
 */
public class Creacion {
    public static void main (String [] args){
        File file = new File ("Archivo.txt");//accediendo al archivo a traves de la ruta relativa
        if (!file.exists()){//si tal archivo no existe 
            try {
                file.createNewFile();//crear el archivo 
                System.out.println(file.getName()+" El archivo se creó");//Mensaje para mostrar que se creo el archivo 
            } catch (IOException ex) {
                Logger.getLogger(Creacion.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
}
