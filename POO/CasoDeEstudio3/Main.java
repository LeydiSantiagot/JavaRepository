
package Elecciones;

import java.util.Scanner;

/**
 *
 * @author LeydiSantiago
 */
public class Main {
    public static void main (String [] arsg){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digita el nombre de la planilla en la que deseen votar"
        +"\nOmega"
        +"\nAlfa"
        +"\nSigma"
        +" ");
       String opcion= entrada.nextLine();
      if (opcion.equalsIgnoreCase("omega")){
          Omega obj1= new Omega();
          obj1.resultados();
      }
      if (opcion.equalsIgnoreCase("Alfa")){
          Alfa obj1= new Alfa();
          obj1.resultados();
      }
      if (opcion.equalsIgnoreCase("sigma")){
          Sigma obj1= new Sigma();
          obj1.resultados();
      }
      
       
    }
}
