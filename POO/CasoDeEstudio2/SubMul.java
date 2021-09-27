/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author LeydiSantiago
 */
public class SubMul extends SuperClase {
      public SubMul(){
          super.parametrosM();
          super.cargaMatrizM();
          multi();
          resultadoM();
      }
    public void multi(){
        for (int i=0;i<filas;i++){
           for (int j=0;j<filas;j++){
               for (int h=0;h<col;h++){
                   matrizC[i][j]+=matrizA[i][h]*matrizB[h][j];
               }
           }
       }
    }
    
    public void resultadoM(){
        System.out.println("Resultado de la multiplicacion de matrices");
        for (int i=0;i<filas;i++){
            for (int j=0;j<filas;j++){
                System.out.print(matrizC[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
