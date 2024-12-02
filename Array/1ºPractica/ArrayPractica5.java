// Maximo

import java.util.Scanner;

class ArrayPractica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int [10];
        int suma = 0;
        int media;
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero");
            numeros[i] = scanner.nextInt();
        }
        for (int i : numeros){
            if (contador < i){
                contador = i;
            }
        }
        System.out.println("El numero mas alto es: "+ contador);
    }
}