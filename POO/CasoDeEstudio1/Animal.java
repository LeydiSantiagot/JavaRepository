/*
 Crear un programa con el nombre del animal, rasgos, que ruido hace y sonido
Usar herencia, polimorfismo y interfaces
 */
package animal;

/**
 *
 * @author LeydiSantiago
 */
public abstract class Animal implements Interfaz {

    protected String nombre;
    protected String rasgo;
    protected String ruido;
    protected String sonido;

    public Animal(String nombre, String rasgo, String ruido, String sonido) {
        this.nombre = nombre;
        this.rasgo = rasgo;
        this.ruido = ruido;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRasgo() {
        return rasgo;
    }

    public String getRuido() {
        return ruido;
    }

    public String getSonido() {
        return sonido;
    }

}
