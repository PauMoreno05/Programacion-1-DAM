//Diseña un algoritmo que lea dos valores y muestre el más grande de ellos

import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double numero1 = inputValue.nextDouble();
        System.out.println("Introduce otro numero");
        double numero2 = inputValue.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El numero con mas valor es:"+ " " +numero1);

        } else {
            System.out.println("El numero con mas valor es"+ " " +numero2);

        }
    }

}