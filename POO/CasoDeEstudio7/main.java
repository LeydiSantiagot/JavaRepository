 
package tablademultiplicarpoo;
import java.util.Scanner;
/**
 *
 * @author LeydiSantiago
 */
public class main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        
        System.out.println("Digita el numero de la tabla que deseas obtener : ");
        int num = in.nextInt();
        TablaDeMultiplicarPOO obj= new TablaDeMultiplicarPOO();
        obj.setNum(num);
        obj.setCicloFor();
    }
}
