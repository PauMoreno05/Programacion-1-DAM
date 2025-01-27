import java.util.Scanner;

public class Ejercicio6_Primo {
    public static boolean calculo(int numero) {
        boolean esPrimo = true ;
        if (numero % 2 == 0) esPrimo = false;
        for (int i = 3; i < numero; i = i +2){
            if (numero % i == 0){
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Intorduce un numero");
        numero = scanner.nextInt();
        if (calculo(numero)){
            System.out.println("Tu numero es primo");
        }else {
            System.out.println("Tu numero no es primo");
        }

    }
}

