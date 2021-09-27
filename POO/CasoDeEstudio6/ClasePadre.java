package herencia1;

import java.util.Scanner;

public class ClasePadre {

    Scanner entrada = new Scanner(System.in);
    int edad, num, Total = 0, Mayores = 0, Menores = 0;
    String genero;

    public void Datos() {
        System.out.print("Digita el numero de personas a analizar: ");
        num = entrada.nextInt();
    }

    public void ResultadoDatos() {
        System.out.println("El total es de: " + Total);
        System.out.println("Mayores de 18: " + Mayores);
        System.out.println("Menores de 18: " + Menores);
    }
}
