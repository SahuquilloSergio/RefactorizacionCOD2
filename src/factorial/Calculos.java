package factorial;
/**
 * 
 * @author Sergio Sahuquillo
 */
public class Calculos {
    //Instanciamos las variables j y f
    int j=8;
    int f;
    //Declaramos los constructores por defecto y por parametros
    public Calculos() {
    }

    public Calculos(int f) {
        this.f = f;
    }
    //Declaramos los Setters y Getters
    public void setJ(int j) {
        this.j = j;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getJ() {
        return j;
    }

    public int getF() {
        return f;
    }
    //Instanciamos un método que realice el cálculo deseado
       public void Calculo1(){

        int i;
        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = j; i >= 1; i--) {
                f = f * i;
            }
        }
}
}
