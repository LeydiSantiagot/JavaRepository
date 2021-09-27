package animal;

import java.util.Scanner;

/**
 *
 * @author LeydiSantiago
 */
public class Gato extends Animal {

    Scanner entrada = new Scanner(System.in);

    public Gato(String nombre, String rasgo, String ruido, String sonido) {
        super(nombre, rasgo, ruido, sonido);
    }

    

    

    @Override
    public void mostrarDatos() {

        System.out.println("\tGato"
                + "\nNombre: " + nombre
                + "\nRasgo: " + rasgo
                + "\nTipo de ruido: " + ruido
                + "\nSonido que emite: " + sonido);
    }

}
