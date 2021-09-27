/*donde se solicite dos datos: Edad y Genero a "N" numero de personas y se obtenga el numero de mujeres mayores de edad, 
el numero de mujeres menores de edad, el numero de mujeres en total, el numero de hombres mayores de edad, 
el numero de hombres menores de edad y el numero total de hombres.
 */
package Unidad2;

import javax.swing.JOptionPane;

public class Metodos {

    int edad, mujeresMayores = 0, mujeresMenores = 0, mujeres = 0, hombresMayores = 0, hombresMenores = 0, hombres = 0;
    String genero;

    public void datos() {
        for (int i = 1; i <= 4; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Persona " + i + " digita tu edad"));
            genero = JOptionPane.showInputDialog("Persona " + i + " digita tu genero");
            if (genero.equalsIgnoreCase("Femenino")) {
                mujeres++;
                if (edad >= 18) {
                    mujeresMayores++;
                } else {
                    mujeresMenores++;
                }
            }
            if (genero.equalsIgnoreCase("Masculino")) {
                hombres++;
                if (edad >= 18) {
                    hombresMayores++;
                } else {
                    hombresMenores++;
                }
            }
        }
    }

    void datosObtenidos() {
        if (mujeres == 0) {
            System.out.println("No se digitó ningún sexo femenino");
        } else {
            JOptionPane.showMessageDialog(null, "El numero total de mujeres es de " + mujeres);
            JOptionPane.showMessageDialog(null, "El numero de mujeres mayores de edad es de " + mujeresMayores);
            JOptionPane.showMessageDialog(null, "El numero de mujeres mayores de edad es de " + mujeresMayores);
        }
        if (hombres == 0) {
            System.out.println("No se digitó ningún sexo masculino");
        } else {
            JOptionPane.showMessageDialog(null, "El numero total de hombres es de " + hombres);
            JOptionPane.showMessageDialog(null, "El numero de hombres mayores de edad es de " + hombresMayores);
            JOptionPane.showMessageDialog(null, "El numero de hombres menores de edad es de " + hombresMenores);
        }

    }
}
