
package herencia1;

public class Herencia1 {

    public static void main(String[] args) {
        // TODO code application logic here
         HijaMujeres Mujeres = new HijaMujeres();
        HijaHombres Hombres = new HijaHombres();

        Mujeres.Datos();
        Mujeres.DatosMujeres();
        System.out.println("MUJERES");
        Mujeres.ResultadoDatos();
        Hombres.Datos();
        Hombres.DatosHombres();
        System.out.println("HOMBRES");
        Hombres.ResultadoDatos();
    }
    }
    

