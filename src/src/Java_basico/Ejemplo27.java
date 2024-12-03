//Inpresion de numeros
import java.util.Scanner;

public class Ejemplo27 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int contador = 1;
        System.out.println("Introduce un numero");
        int numero = inputValue.nextInt();


        for (int i = 1; i <= numero; i++) {
            for (int s = 1; s <= i; s++ ){
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
