/*
EXISTEN TRES PLANILLAS ESTUDIANTILES: ALFA, OMEGA Y SIGMA.
CADA PLANILLA TIENE TRES PRECANDIDATOS A LA PRESIDENCIA, EL QUE TENGA MAS VOTOS SERA EL PRESIDENTE, EL SEGUNDO LUGAR VICEPRESIDENTE Y EL TERCERO TESORERO.
DEBEMOS PREGUNTAR A 10 ESTUDIANTES QUE ELIJAN A SU CANDIDATO Y POR LA CANTIDAD DE VOTOS (DEL CANDIDATO) LA PLANILLA LE DARA SU PUESTO (PRESIDENTE, VICEPRESIDENTE Y TESORERO). CABE ACLARAR QUE LA ELECCION ES INDEPENDIENTE PARA LAS PLANILLAS.
NOTA: EL NOMBRE DEL CANDIDATO ES LIBRE, PUEDES UTILIZAR CANDIDATO X, CANDIDATO Y, Y CANDIDATO Z. AL INICIO DEBES DAR LA OPCION DE QUE PLANILLA QUIEREN VOTAR. EL POLIMORFISMO ES EN EL RESULTADO DE LAS PLANILLAS. EL RESULTADO DEBE SER QUIEN ES PRESIDENTE, VICEPRESIDENTE Y TESORERO.
 */
package Elecciones;

import java.util.Scanner;

/**
 *
 * @author LeydiSantiago
 */
public abstract class Padre {

    Scanner entrada = new Scanner(System.in);
    String presidente;
    String vicePresidente;
    String tesorero;

    

    public String getPresidente() {
        return presidente;
    }

    public String getVicePresidente() {
        return vicePresidente;
    }

    public String getTesorero() {
        return tesorero;
    }

    public void elecciones() {
        String voto;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Estudiante "+i+" digita el candidato de tu agrado (candidato 1, candidato 2, candidato 3)");
            voto = entrada.nextLine();
            if (voto.equalsIgnoreCase("candidato 1")) {
                candidato1++;
            } else if (voto.equalsIgnoreCase("candidato 2")) {
                candidato2++;
            } else if (voto.equalsIgnoreCase("candidato 3")) {
                candidato3++;
            }

        }
        if ((candidato1 > candidato2) && (candidato1 > candidato3)) {
            System.out.println("El candidato 1 obtiene la presidencia");
            if (candidato2 > candidato3) {
                System.out.println("El candidato 2 obtiene la Vicepresidencia");
                System.out.println("El candidato 3 obtuvo el puesto de tesorero");
            } else if (candidato3 > candidato2) {
                System.out.println("El candidato 3 obtiene la Vicepresidencia");
                System.out.println("El candidato 2 obtuvo el puesto de tesorero");
            }
        }
        if ((candidato2 > candidato1) && (candidato2 > candidato3)) {
            System.out.println("El candidato 2 obtiene la presidencia");
            if (candidato1 > candidato3) {
                System.out.println("El candidato 1 obtiene la Vicepresidencia");
                System.out.println("El candidato 3 obtuvo el puesto de tesorero");
                }
            else if (candidato3>candidato1){
                 System.out.println("El candidato 3 obtiene la Vicepresidencia");
                System.out.println("El candidato 1 obtuvo el puesto de tesorero");
            }
        }
        
        if ((candidato3>candidato1)&&(candidato3>candidato2)){
            System.out.println("El candidato 3 obtiene la presidencia");
            if (candidato1>candidato2){
                System.out.println("El candidato 1 obtiene la Vicepresidencia");
                System.out.println("El candidato 2 obtuvo el puesto de tesorero");
            }
            else if (candidato2>candidato1){
                 System.out.println("El candidato 2 obtiene la Vicepresidencia");
                System.out.println("El candidato 1 obtuvo el puesto de tesorero");
            }
        }

    }
    public abstract void resultados();
}
