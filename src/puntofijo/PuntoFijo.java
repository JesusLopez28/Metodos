package puntofijo;

public class PuntoFijo {

    String consola = "";
    double error;
    double errorRelativo;
    double erp;

    public String puntofijo(String funcion, double x, double margen, int decimales) {

        EvaluarX EX = new EvaluarX();
        Redondeo R = new Redondeo();
        int cifras = decimales;

        error = margen + 1;
        double resultado = 0;

        consola += "X\t\tFuncion(x)\t\tError";
        consola += "\n";

        while (error > margen) {

            try {

                resultado = R.redondear((EX.evaluarFuncion(funcion, x)), cifras);
                error = Math.abs(resultado - x);
                error = R.redondear(error, cifras);
                consola += "" + x + "\t\t" + resultado + "\t\t" + error;
                consola += "\n";
                x = resultado;
            } catch (Exception e) {
            }

        }
        return consola;
    }

}
