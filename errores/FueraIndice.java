//Para èste Ejercicio exploraremos el error ArrayIndexOutOfBoundsException, el cual se origina cuando de un arreglo definido
//el valor solicitado corresponde a un ìndice que no existe, es decir que si cramos un arreglo 5 posiciones, el error se activara si pedimos que nos relacione
//en valor de la posiciòn 6 la cual no existe porque no esta definida en el arreglo

public class FueraIndice {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5}; //Arreglo de 5 posiciones

        try {
            int valor = arreglo[5]; //solicitamos el valor de la posicion 6
            System.out.println("Valor: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Índice fuera de rango");
        }
    }
}