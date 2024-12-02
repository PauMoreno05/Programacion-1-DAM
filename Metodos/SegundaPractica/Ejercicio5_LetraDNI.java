import java.util.Scanner;

public class Ejercicio5_LetraDNI {
    public static char calculo(int dni) {
        int calculo = 0;
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','Q','V','H','L','C','K','E'};
        calculo = dni % 23;
        return letra[calculo];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni;
        System.out.println("Introduce tus numeros del DNI sin la letra final");
        dni = scanner.nextInt();
        System.out.println(calculo(dni));

    }
}

