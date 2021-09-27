/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LeydiSantiago
 */
public class SuperClase {
    Scanner entrada = new Scanner (System.in);
     int filas, col, matrizA[][], matrizB[][], matrizC[][];
        
     public void parametros(){
         JOptionPane.showMessageDialog(null,"Parametros");
        filas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas"));
        col = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas "));
        matrizA = new int[filas][col];
        matrizB = new int[filas][col];
        matrizC = new int [filas][col];
     }
     public void CargaMatriz(){
        System.out.println("Llenado de matriz A");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
            }
        System.out.println("Llenado de matriz B");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
            }
        }
     public void parametrosM(){
         JOptionPane.showMessageDialog(null,"Parametros");
        filas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas"));
        col = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas "));
         matrizA = new int[filas][col];
        matrizB = new int[col][filas];
         matrizC = new int [filas][filas];
     }
     
     public void cargaMatrizM(){
         System.out.println("Llenado de matriz A");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
            }
        System.out.println("Llenado de matriz B");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
            }
     }
    
     

}
