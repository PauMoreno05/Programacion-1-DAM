//Un programa que calcula y muestra el área de un cuadrado cuyo lado se introduce por pantalla

import java.util.Scanner;
public class ejemplo5 {
    public static void main (String[] args) {

    Scanner inputValue = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int numero1 = inputValue.nextInt();

    System.out.println("Introduce un numero");
    int numero2 = inputValue.nextInt();

    inputValue.close();

    System.out.println("Suma:");
    System.out.println(numero1+numero2);
    System.out.println("Resta:");
    System.out.println(numero1-numero2);
    System.out.println("Multiplicacion:");
    System.out.println(numero1*numero2);
    System.out.println("Division:");
    System.out.println(numero1/numero2);
    }
}
