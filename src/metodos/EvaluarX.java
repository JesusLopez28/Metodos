package metodos;

public class EvaluarX {

    public double evaluarFuncion(String funcion, double x) {

        String sustitucion = "";
        sustitucion = funcion.replace("e^", "e");
        sustitucion = sustitucion.replaceAll("x", String.valueOf(x));
        sustitucion = sustitucion.replaceAll("E", "*10^");

        EvaluadorFunciones EF = new EvaluadorFunciones();
        double resultado = 0.0;
        try {
            resultado = EF.eval(sustitucion);
        } catch (Exception excepcion) {
        }

        return resultado;
    }

    public String sustitucionx1(String funcion, double x) {
        String sustitucionx = funcion.replaceAll("x1", String.valueOf(x));
        return sustitucionx;
    }

    public String sustitucionx2(String funcion, double x) {
        String sustitucionx = funcion.replaceAll("x2", String.valueOf(x));
        return sustitucionx;
    }

    public String sustitucionx3(String funcion, double x) {
        String sustitucionx = funcion.replaceAll("x3", String.valueOf(x));
        return sustitucionx;
    }

    public double evaluarFuncionxxx(String funcion, double x1, double x2, double x3) {
        String sustitucionx = funcion;
        sustitucionx = sustitucionx1(sustitucionx, x1);
        sustitucionx = sustitucionx2(sustitucionx, x2);
        sustitucionx = sustitucionx3(sustitucionx, x3);

        EvaluadorFunciones EF = new EvaluadorFunciones();
        return EF.eval(sustitucionx);

    }

}
