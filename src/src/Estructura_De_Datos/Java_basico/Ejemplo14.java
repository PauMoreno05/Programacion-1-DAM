//Diseña un algoritmo que lea un valor numérico entero correspondiente a la nota de un examen y muestre su valor en letra

import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce tu nota en valor numerico");
        double nota = inputValue.nextDouble();
        inputValue.close();

        if (nota >= 0 && nota < 3) {
            System.out.println("nota muy deficiente");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Nota insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Nota suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Nota (Bien)");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Nota (Notable)");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Nota Sobresaliente");
        } else {
            System.out.println("Opción no valida");
        }
    }
}