
package excepciones;

import java.util.Scanner;

/**
 *
 * @author LeydiSantiago
 */
public class Division {
   //Manejo de excepciones con try catch finally
    public static void main (String [] arsg){
        try{//intentar ejecutar el codigo
            Scanner entrada = new Scanner (System.in);
        int num1, num2;
        System.out.println("Digita un numero: ");
        num1= entrada.nextInt();
        System.out.println("Digita otro numero");
        num2= entrada.nextInt();
        System.out.println("El resultado de la division entre "+num1+" y "+num2+" es: "+(num1/num2));
          
        }catch(Exception e){//cachando excepciones si las hay
            System.out.println("Eror: "+e);//enviando respuesta si hay error
        } finally{//no importa si el programa tuvo errores o no, esta parte del codigo siempre se va a ejecutar
            System.out.println("Yo siempre me ejecuto");
        }
        
     
       
    }
    
}
