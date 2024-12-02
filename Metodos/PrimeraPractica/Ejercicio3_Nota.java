import java.util.Scanner;

public class Ejercicio3_Nota {
    public static void calculo(int nota) {
        if (nota >= 0 && nota < 3){
            System.out.println("Muy insuficiente");
        } else if (nota >= 3 && nota <5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota <9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
    }

    public static void main(String[] args) {
        int nota = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        nota = scanner.nextInt();
        calculo(nota);

    }
}

