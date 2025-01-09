package Array;

import java.util.Scanner;

public class Ejercicio5_Eliminar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indice = 0;
        int valor;
        int[] array1 = new int [10];
        Utilidades.rellenaArray(array1,1,10);
        for (int i : array1) System.out.print(i + " ");
        System.out.println();
        do {
            System.out.println("Introduce un valor entero.");
            indice = scanner.nextInt();
        }while (indice >= array1.length);
        valor = array1[indice-1];

        for (int i = indice; i < array1.length -1; i++){
            array1[i] = array1[i+1];
        }
        array1[array1.length -1] = valor;
        for (int i : array1) System.out.print(i + " ");

    }
}

