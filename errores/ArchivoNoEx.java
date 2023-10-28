// En este caso exploramos el error FileNotFoundException, que se origina cuando al buscar un archivo en una linea, èste no lo encuentra

import java.io.*;
public class ArchivoNoEx {
    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("prueba1.txt");
            System.out.println("El archivo existe y esta corriendo");
            archivo.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado");
        } catch (IOException e) {
            System.err.println("Error de entrada/salida al abrir el archivo");
        }
    }
}

