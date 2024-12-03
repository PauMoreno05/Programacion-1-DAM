//Números positivos II
import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numero;
        int contador = 0;

        do {
            System.out.println("Introduce un numero. Si quieres acabar el proceso presione '0' ");
            numero = inputValue.nextInt();

            if (numero > 0) {
                contador = contador + 1;
            }

            }while (numero != 0);

        System.out.println("Numero de valores positivos en la lista: " + contador);
        inputValue.close();
    }
}
