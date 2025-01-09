package Conversion;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4_Positivos {
    public static int calculo(int[] num) {
        int contador = 0;
        for (int numero : num){
            if (numero >= 0){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        Utilidades.rellenaArray(array, -10, 10);
        System.out.println(Arrays.toString(array));
        System.out.println("Hay " + calculo(array) + " positivos");

    }
}
