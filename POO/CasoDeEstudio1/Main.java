package animal;

/**
 *
 * @author LeydiSantiago
 */
public class Main {

    public static void main(String[] arsg) {
        //Dependiendo de la instancia y con que clase nos estemos comunicando, el metodo mostrarDatos mostrara los datos correspondientes
        Animal obj = new Perro("Afrika", "Negra", "Ladrar", "Guau guau");
        obj.mostrarDatos();
        System.out.println("");
        Animal obj1 = new Gato("luna","ojos azules","mauyar", "miau miau");
        
        obj1.mostrarDatos();
        System.out.println("");
        Animal obj3 = new Vaca("Manchas", "Manchas color cafe", "Mugir", "MUUUUU");
        obj3.mostrarDatos();
        System.out.println("");
    }
}
