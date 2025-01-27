//Un programa que pida el precio real de un producto, el precio rebajado y muestre el descuento realizado

import java.util.Scanner;
public class ejemplo7{
    public static void main(String[] args){
    Scanner inputValue = new Scanner(System.in);

    System.out.println("Introduce el precio real");
    double precioR = inputValue.nextDouble();
    System.out.println("Introduce el precio con descuento");
    double precioD = inputValue.nextDouble();
    inputValue.close();

    double descuento = ((precioR-precioD)/precioR*100);
    System.out.println("El descuento es del: "+descuento+"%");
    }
}
