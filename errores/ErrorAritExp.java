//Pare èste caso, exploraremos el error IllegalArgumentException, que se activa al momento en que el resultado de
//una operacion matemàtica da como resultado un nùmero indeterminado, para èste caso encontraremos la raiz cuadrada de un numero negativo

public class ErrorAritExp {
    public static void main(String[] args) {
    double numero = -5;

    try {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
            double resultado = Math.sqrt(numero);
            System.out.println("Resultado: " + resultado);
    } catch (IllegalArgumentException e) {
        System.err.println("Error: " + e.getMessage());
    }
    }
}