package Array;

import java.util.Scanner;

public class Ejercicio7_Inverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int [10];
        Utilidades.rellenaArray(array1,0,10);
        for (int i : array1) System.out.print(i + " ");
        System.out.print(array1 + " ");
        System.out.println(" ");
        for (int i = 0; i <= array1.length -1; i++){
            System.out.print(array1[array1.length -1 -i] + " ");
        }
    }
}

