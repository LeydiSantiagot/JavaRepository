/*
 Encontrar el promedio de 5 alumnos en una materia, donde la materia tenia 4 unidades, y al final visualizar quien es el alumno de mejor promedio con su promedio.
Cabe aclarar que son tres materias: POO, Calculo y Algebra Lineal.
 */
package AlumnosPromedio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LeydiSantiago
 */
public abstract class Promedio {

    Scanner entrada = new Scanner(System.in);
    //Atributos 
    String nombreMejorAlumno;
    double mejorPromedio;

    public Scanner getEntrada() {
        return entrada;
    }

    public String getNombreMejorAlumno() {
        return nombreMejorAlumno;
    }

    public double getMejorPromedio() {
        return mejorPromedio;
    }

    public void calificacionesYpromedios() {
        String alumno[] = new String[5];
        double calif;
        double sumaCalificaciones = 0;
        double promedio;
        double promedios[] = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digita el nombre del alumno");
            alumno[i] = entrada.nextLine();
            for (int x = 1; x <= 4; x++) {
                System.out.println("Digita la califcacion de la unidad " + x);
                calif = entrada.nextDouble();
                sumaCalificaciones += calif;
            }
            entrada.nextLine();//borrar el buffer despues de sumar
            promedio = sumaCalificaciones / 4;//el promedio de un alumno 
            promedios[i] = promedio;
            sumaCalificaciones = 0;
            promedio = 0;
            //y vuelve a pedir el nombre de otro alumno 
        }
        String nombre;
        double mayor = 0;
        for (int a = 0; a < 5; a++) {
            if (promedios[a] > mayor) {
                mejorPromedio = promedios[a];
                nombreMejorAlumno = alumno[a];

            }
        }
    }

    public abstract void datosfinales();
}
