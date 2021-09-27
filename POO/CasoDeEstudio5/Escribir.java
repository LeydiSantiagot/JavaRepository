/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LeydiSantiago
 */
public class Escribir {
    public static void main (String [] arsg){
    File miArchivo;
    
    PrintWriter escribir;
    miArchivo = new File ("Escribiendo.txt");
    if (!miArchivo.exists()){
        try {
            miArchivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else{
        try {
              escribir = new PrintWriter (miArchivo, "utf-8");  
              escribir.println("Aqui se escribe en el archivo");
              escribir.close();//aqui se cierra el archivo 
            } catch (Exception e) {
                e.getMessage();
            }
            
       
    }
}
}
