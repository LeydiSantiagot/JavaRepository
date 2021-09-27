/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnosPromedio;

/**
 *
 * @author LeydiSantiago
 */
public class Poo extends Promedio {

    public Poo() {
        super.calificacionesYpromedios();
        datosfinales();
    }

    @Override
    public void datosfinales() {

        System.out.println("\tProgramacion orientada a objetos");
        System.out.println(nombreMejorAlumno + " (alumno con mejor promedio)");
        System.out.println("Con promedio de " + mejorPromedio);
    }

}
