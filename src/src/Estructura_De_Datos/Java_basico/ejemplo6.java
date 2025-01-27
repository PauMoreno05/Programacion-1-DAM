//Un programa que pida el radio de una circunferencia y muestre su área y su perímetro

import java.util.Scanner;
public class ejemplo6 {
  static final double PI = Math.PI;
  public static void main (String[] args) {

    Scanner inputValue = new Scanner(System.in);
    System.out.println("Introduce el radio");
    float radio = inputValue.nextFloat();

    inputValue.close();

    System.out.println("Perimetro:");
    System.out.println(2*PI*radio);
    System.out.println("Area:");
    System.out.println(PI*radio*radio);
    }
}
