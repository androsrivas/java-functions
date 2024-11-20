public class Calculator {
    
    public static void main(String[] args) {
        //Ejecuta aquí todos los métodos creados e imprime en la terminal.
        double number1 = 24.7;
        double number2 = 19.92;

        System.out.println(add(number1, number2));
        System.out.println(substract(number1, number2));
        System.out.println(multiply(number1, number2));
        System.out.println(divide(number1, number2));
    }

    //Define los métodos basándote en su doc comment.

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */
    public static double add (double number1, double number2) {
        return number1 + number2;
    }

    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */
    public static double substract (double number1, double number2) {
        return number1 + number2;
    }

    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */
    public static double multiply (double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */
    public static double divide (double number1, double number2) {
        return number1 / number2;
    }

}
