/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

public class Derivada {

    public double obtenerDerivada(String funcion, double x0, int decimales) {

        double h = 0.001;
        EvaluarX EX = new EvaluarX();

        double funcionx0mash = EX.evaluarFuncion(funcion, (x0 + h));
        double funcionx0menosh = EX.evaluarFuncion(funcion, (x0 - h));

        double centrada = (funcionx0mash - funcionx0menosh) / (2 * h);

        Redondeo r = new Redondeo();
        return r.redondear(centrada, decimales);
    }
}

