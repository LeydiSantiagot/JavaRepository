/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author LeydiSantiago
 */
public class Main {
    public static void main (String [] arsg){
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Operaciones con matrices (digite el numero de operacion): "
                + "\n1.Suma"
                + "\n2.Resta"
                + "\n3.Multiplicacion"
                +"\n4.Traspuesta"));
        switch (num){
            case 1: 
                 SubSuma suma = new SubSuma();
                
                 break;
            case 2:
                SubResta resta= new SubResta();
                break;
            case 3:
                 SubMul mul = new SubMul();
                 break;
           
            default: 
                JOptionPane.showMessageDialog(null,"Digita un numero correcto");
                break;
        }
        
    }
}
