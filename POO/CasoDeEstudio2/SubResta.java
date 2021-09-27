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
public class SubResta extends SuperClase {
     
      public SubResta(){
          super.parametros();
          super.CargaMatriz();
          resta();
          resultadoR();
      }
    public void resta(){
        for (int i=0;i<filas;i++){
           for (int j=0;j<col;j++){
               matrizC[i][j]= matrizA[i][j]-matrizB[i][j];
           }
       }
    }
    
    public void resultadoR(){
        System.out.println("Resultado de la resta de matrices");
        for (int i=0;i<filas;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrizC[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
