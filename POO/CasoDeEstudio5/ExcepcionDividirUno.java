
package excepciones;

/**
 *
 * @author LeydiSantiago
 */
public class ExcepcionDividirUno extends RuntimeException {

    public ExcepcionDividirUno() {
        this ("Eror");
    }
    
    public ExcepcionDividirUno(String str){
        super (str+" No se puede divir entre 1");
    }
}
