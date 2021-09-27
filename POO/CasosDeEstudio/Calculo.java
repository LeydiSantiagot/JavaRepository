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
public class Calculo extends Promedio {

    public Calculo() {
        super.calificacionesYpromedios();
        datosfinales();
    }

    @Override
    public void datosfinales() {

        System.out.println("\tCalculo");
        System.out.println(nombreMejorAlumno + " (alumno con mejor promedio)");
        System.out.println("Con promedio de " + mejorPromedio);
    }

}
