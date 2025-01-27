// Media de un array (F)

import java.util.Scanner;

class ArrayPractica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int [10];
        int suma = 0;
        int media;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce las notas");
            notas[i] = scanner.nextInt();
        }
        for (int i : notas){
            suma += i;
        }
        media = suma / notas.length;
        System.out.println("La media de todas las notas es: " + media);
    }
}