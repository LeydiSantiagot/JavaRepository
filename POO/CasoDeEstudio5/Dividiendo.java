
package excepciones;

import java.util.Scanner;

/**
 *
 * @author LeydiSantiago
 */
public class Dividiendo {
    Scanner entrada = new Scanner (System.in);
public void divide() throws ExcepcionDividirUno{
    System.out.println("Digita un numero entero: ");
    int num1= entrada.nextInt();
    System.out.println("Digita un segundo numero entero: ");
    int num2= entrada.nextInt();
    if (num2==1){
        throw new ExcepcionDividirUno();
    }
    else{
        System.out.println("El resultado de la division es: "+(num1/num2));
    }
}
public static void main (String [] arsg){
    Dividiendo obj1= new Dividiendo();
    obj1.divide();
    
}


}
