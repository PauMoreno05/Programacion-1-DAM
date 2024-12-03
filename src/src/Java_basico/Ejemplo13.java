//Realiza un programa que lea dos valores y los orden ascendente o descendentemente según elija el usuario

import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double numero1 = inputValue.nextDouble();
        System.out.println("Introduce otro numero");
        double numero2 = inputValue.nextDouble();
        System.out.println("A - Ascendente / D - Descendente");
        char orden = inputValue.next().charAt(0);

        if (orden == 'A') {
            if (numero1 < numero2) {
                System.out.println("Orden ascendente: " + numero1 + " " + numero2);
            } else {
                System.out.println("Orden ascendente: " + numero2 + " " + numero1);
            }
        } else if (orden == 'D') {
            if (numero1 > numero2) {
                System.out.println("Orden descendente: " + numero1 + " " + numero2);
            } else {
                System.out.println("Orden descendente: " + numero2 + " " + numero1);
            }
        } else {
            System.out.println("Opción no válida, valores incorrectos.");
        }

        inputValue.close();
    }
}