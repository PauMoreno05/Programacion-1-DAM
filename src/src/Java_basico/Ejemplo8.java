//Realiza un programa que pida la edad al usuario y muestre un mensaje si es mayor de edad

import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        double Edad = inputValue.nextDouble();

        if (Edad >= 18){
            System.out.println("Eres mayor de edad");
        }
    }
}