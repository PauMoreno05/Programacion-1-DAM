//Diseña un algoritmo que lea dos valores y los muestre en orden ascendente

import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double numero1 = inputValue.nextDouble();
        System.out.println("Introduce otro numero");
        double numero2 = inputValue.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero2+", "+numero1);

        } else {
            System.out.println(numero1+", "+numero2);

        }
    }
}