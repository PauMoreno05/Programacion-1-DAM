//Fibonacci
import java.util.Scanner;

public class Ejemplo32 {
    public static void main(String[] args) {
        int numero = 40;
        int s = 0;
        int f = 1;
        int sigNum;
        System.out.println("0 1");

        while (numero >= 2){
            sigNum = s;
            s = f;
            f = sigNum + f;
            System.out.print(" " + f + " ");
            numero--;
        }

    }
}


