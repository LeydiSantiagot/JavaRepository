package tablademultiplicarpoo;

/**
 *
 * @author LeydiSantiago
 */
public class TablaDeMultiplicarPOO {

    int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setCicloFor() {

        for (int i = 1; i <= 10; i++) {
            int resul = num * i;
            System.out.println(num + "X" + i + "= " + resul);

        }
    }

}
