import java.util.Scanner;

public class ejercicio3_EsPositivo {
    public static boolean elevado(double num) {
        if (num >= 0){
            return true;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduce un numero");
        num = scanner.nextInt();
        if (elevado(num)){
            System.out.println("El numero introducido es positivo0");
        }else {
            System.out.println("El numero introducido es negativo");
        }

    }
}
