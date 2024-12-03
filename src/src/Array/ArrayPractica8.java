// 8 Suma positivos y negativos (F)

import java.util.Scanner;

class ArrayPractica8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumpos = 0;
        int sumne = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introducel el numero");
            numeros[i] = scanner.nextInt();
        }
        for (int i : numeros){
            if (i >= 0){
                sumpos = sumpos + i;
            } else if (i < 0){
                sumne = sumne + i;
            }

        }
        System.out.println("Numeros positivos: " + sumpos);
        System.out.println("Numeros negativos: " + sumne);
    }
}