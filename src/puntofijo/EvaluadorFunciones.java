package puntofijo;

public class EvaluadorFunciones {


    public static double eval(final String str) {
       
        return new Object() {
            
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                    
                return false;
            
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // suma
                    else if (eat('-')) x -= parseTerm(); // resta
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplicación 
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unario +
                if (eat('-')) return -parseFactor(); // unario -

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentesis
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numeros
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // funciones
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sen")) x = Math.sin(x);
                    else if (func.equals("cos")) x = Math.cos(x);
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("e")) x = Math.exp(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    
                    else throw new RuntimeException("Unknown function: " + func);

                } else {
                     
                    throw new RuntimeException("Unexpected: " + (char)ch);
                   
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentes
            
                return x;
            }
        }.parse();
    }



}
