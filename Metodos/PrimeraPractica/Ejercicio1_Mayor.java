import java.util.Scanner;

public class Ejercicio1_Mayor {
    public static void calculoEdad(int edad) {
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        System.out.println("Introduce tu edad en numeros");
        edad = scanner.nextInt();
        calculoEdad(edad);
        scanner.close();
    }
}
