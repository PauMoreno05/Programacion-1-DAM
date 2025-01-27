//Realiza un programa que lea dos números enteros y dependiendo de la operación que indique el usuario (+, -, * , /) muestre el resultado

import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Inroduce un numero");
        int numero1 = inputValue.nextInt();
        System.out.println("Inroduce otro numero");
        int numero2 = inputValue.nextInt();
        System.out.println("Que operacion quieres realizas | + | - | * | / |");
        char operacion = inputValue.next().charAt(0);
        inputValue.close();

        if (operacion == '+') {
            System.out.println("El resultado de la suma es: " + numero1 + numero2);
        }else if (operacion == '-') {
            System.out.println("El resultado de la resta es: "+ numero1 + numero2);
        }else if (operacion == '-') {
            System.out.println("El resultado de la resta es: "+ numero1 + numero2);
        }else if (operacion == '*') {
            System.out.println("El resultado de la multiplicacion es: "+ numero1 * numero2);
        }else if (operacion == '/') {
            System.out.println("El resultado de la division es: " + numero1 / numero2);


        }
    }
}