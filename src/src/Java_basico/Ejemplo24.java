//Nota media
import java.io.PrintStream;
import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int notas;
        int contador = 0;
        int media = 0;
        int media2 = 0;
        boolean hayDiez = true;

        do {
            System.out.println("Introduce todas tus notas para realizar una meida. Si quieres acabar el proceso presione '-1' ");
            notas = inputValue.nextInt();

            if (notas > 0) {
                contador = contador + 1;
                media = media + notas;
            }

            if (notas == 10){
                hayDiez = true;
            }

            }while (notas != -1);


        media2 = media / contador;
        System.out.println("tu media es de: " + media2);
        inputValue.close();

        if (hayDiez == true) {
            System.out.println("Hay uno o varios diezes en tus notas");

        }
    }
}
