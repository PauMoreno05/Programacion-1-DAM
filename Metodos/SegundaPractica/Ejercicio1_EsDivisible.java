import java.util.Scanner;

public class Ejercicio1_EsDivisible {
    public static boolean calculo(int num1, int num2) {
        boolean esDivisor = true;
        if (num1 % num2 != 0){
            esDivisor = false;
        }
        return esDivisor;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce un numero");
        num1 = scanner.nextInt();
        System.out.println("Introduce otro numero");
        num2 = scanner.nextInt();
        System.out.println(calculo(num1, num2));

    }
}

