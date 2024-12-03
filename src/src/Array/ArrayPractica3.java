//3 DNI (F)

import java.util.Scanner;

class ArrayPractica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni;
        int div;
        System.out.println("Introduce tu DNI");
        dni = scanner.nextInt();
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','Q','V','H','L','C','K','E'};
        div = dni % 23;
        System.out.println(dni + "-" + letra[div]);
       scanner.close();
    }
}
