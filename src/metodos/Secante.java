/*
 López Rosales Jesús Alejandro
 22110104       3°O       CETI
 */
package metodos;

public class Secante {

    public String consola = "";

    public String metodoSecante(double x0, double x00, String funcion, double tolerancia, int decimales) {

        double f0;
        double f00;
        double z = 0;

        int contador = 0;
        double error = tolerancia + 1;

        Redondeo R = new Redondeo();
        EvaluarX ex = new EvaluarX();

        consola += "Xn\tXn-1\tf(xn)\tf(xn+1)\tError";
        consola += "\n";
        consola += "__________________________________";
        consola += "\n";
        consola += x0 + "\t" + x00;
        f0 = R.redondear(ex.evaluarFuncion(funcion, x0), decimales);
        f00 = R.redondear(ex.evaluarFuncion(funcion, x00), decimales);
        consola += "\t" + f0 + "\t" + f00 + "\t---\n";

        //System.out.println("__________________________________");
        consola += "\n";

        while (error > tolerancia) {

            z = x0;
            x0 = R.redondear((x0 - (f0 / ((f0 - f00) / (x0 - x00)))), decimales);
            x00 = z;

            f0 = R.redondear(ex.evaluarFuncion(funcion, x0), decimales);
            f00 = R.redondear(ex.evaluarFuncion(funcion, x00), decimales);

            error = R.redondear((Math.abs(Math.abs(x0) - Math.abs(x00))), decimales);
            consola += x0 + "\t" + x00 + "\t" + f0 + "\t" + f00 + "\t" + error;

            consola += "\n";
        }
        return consola;

    }

}
