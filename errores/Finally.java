public class Finally {
    public static void main(String[] args) {
        int numerador = 5;
        int denominador = 0;

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: División por cero");
        } finally {
            System.out.println("Esta parte se ejecuta siempre");
        }
    }
}
