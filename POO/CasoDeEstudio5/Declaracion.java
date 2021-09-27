/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author LeydiSantiago
 */
public class Declaracion {
    public void leerArchivo() throws FileNotFoundException{
        File Archivo= new File ("*.txt");
        FileReader fr= new FileReader (Archivo);
        
    }
}
