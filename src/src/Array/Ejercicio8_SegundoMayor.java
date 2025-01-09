package Array;

import java.util.Scanner;

public class Ejercicio8_SegundoMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor = 0;
        int[] array1 = new int [10];
        Utilidades.rellenaArray(array1,0,10);
        for (int i : array1) System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < array1.length -1; i++){
            if (array1[i] > mayor){
                mayor = array1[i];
            }
        }
        for (int j = 0 ; j < array1.length - 1; j++){
            if (array1[j] == array1[mayor]){
                array1[j] = 0;
            }
        }
        for (int i : array1) System.out.print(i + " ");
        for (int i : array1){
            if (i > mayor){
                System.out.println("El segundo numero mayor del array es : " + i);
            }
        }
    }
}

