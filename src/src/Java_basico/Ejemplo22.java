//Números positivos
import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numero;
        int contador = 0;

        for (int lista = 0; lista < 10; lista++) {
            System.out.println("Introduce un numero");
            numero = inputValue.nextInt();
            if (numero >= 0) contador++;

        }

        System.out.println("Numero de valores positivos en la lista: " + contador);
        inputValue.close();
    }
}
