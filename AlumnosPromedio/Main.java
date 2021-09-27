package AlumnosPromedio;

import java.util.Scanner;

/**
 *
 * @author LeydiSantiago
 */
public class Main {

    public static void main(String[] arsg) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("\tPromedios generales");
        System.out.println("Digita el numero de la materia que desees"
                + "\n1.POO"
                + "\n2.Calculoo"
                + "\n3.Algebra lineal: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                Poo obj1 = new Poo();
                break;
            case 2:
                Calculo obj2 = new Calculo();

                break;
            case 3:
                Algebra obj3 = new Algebra();

                break;
            default:
                System.out.println("Error, digita una opcion correcta");
        }
    }
}
