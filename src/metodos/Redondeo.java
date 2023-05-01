/*
 López Rosales Jesús Alejandro
 22110104       3°O       CETI
 */
package metodos;

public class Redondeo {

    public double redondear(double numero, int digitos) {
        int cifras = (int) Math.pow(10, digitos);
        return Math.rint(numero * cifras) / cifras;
    }

}
