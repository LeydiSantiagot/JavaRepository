/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author LeydiSantiago
 */
public class Perro extends Animal {

    public Perro(String nombre, String rasgo, String ruido, String sonido) {
        super(nombre, rasgo, ruido, sonido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\tPerro"
                + "\nNombre: " + nombre
                + "\nRasgo: " + rasgo
                + "\nTipo de ruido: " + ruido
                + "\nSonido que emite: " + sonido);
    }

}
