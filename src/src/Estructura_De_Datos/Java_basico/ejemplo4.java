//Un programa que calcula y muestra el área de un cuadrado cuyo lado se introduce por pantalla

import java.util.Scanner;
public class ejemplo4 {
    public static void main (String[] args) {

    float lado;
    Scanner inputValue = new Scanner(System.in);
    System.out.println("Introduce el lado");
    lado = inputValue.nextFloat();
    inputValue.close();
    System.out.println(lado*lado);
    }
}
