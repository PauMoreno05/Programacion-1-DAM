// 8 Suma positivos y negativos (F)

import java.util.Scanner;

class ArrayPractica9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contpar = 0;
        int contim = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introducel el numero");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0 ){
                contpar++;
            }else {
                contim++;
            }
        }
        System.out.println("Numeros pares: " + contpar);
        System.out.println("Numeros impares: " + contim);
    }
}