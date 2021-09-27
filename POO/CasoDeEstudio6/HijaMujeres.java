package herencia1;

public class HijaMujeres extends ClasePadre {

    public void DatosMujeres() {
        for (int i = 1; i <= num; i++) {
            
            System.out.print(i+".Digita tu edad: ");
            edad=entrada.nextInt();
            System.out.print(i+".Digita tu genero: ");
            genero= entrada.next();
            if (genero.equalsIgnoreCase("Femenino")) {
                Total++;
                if (edad >= 18) {
                    Mayores++;
                } else {
                    Menores++;
                }
            }
        }
    }
}
