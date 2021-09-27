package herencia1;

public class HijaHombres extends ClasePadre {

    public void DatosHombres() {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + ".Digita tu edad: ");
            edad = entrada.nextInt();
            System.out.print(i + ".Digita tu genero: ");
            genero = entrada.next();
            if (genero.equalsIgnoreCase("Masculino")) {
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
