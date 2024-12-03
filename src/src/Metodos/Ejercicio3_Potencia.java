import java.util.Scanner;

public class Ejercicio3_Potencia {
    public static double elevado(double num1, int num2) {
        if (num2 == 0){
            return 1;
        }
        return num1 * elevado(num1, num2 -1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        int num2;
        System.out.println("introduce el numero");
        num1 = scanner.nextInt();
        System.out.println("introduce el elevaado");
        num2 = scanner.nextInt();
        System.out.println(elevado(num1, num2));

    }
}

