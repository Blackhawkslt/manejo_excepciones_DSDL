// Para este ejercicio exploramos el error NumberFormatException, la cual se origina cuando al intentar cambiar el tipo de variable, no es posible intercambiar este formato

public class FormatoInvalido {
    public static void main(String[] args) {
        String numero = "abc";
    
            try {
                int valor = Integer.parseInt(numero);
                System.out.println("Valor: " + valor);
            } catch (NumberFormatException e) {
                System.err.println("Error: Formato de número incorrecto");
            }
        }
    }

