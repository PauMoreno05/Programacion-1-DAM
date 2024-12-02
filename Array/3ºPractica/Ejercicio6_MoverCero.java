import java.util.Scanner;

public class Ejercicio6_MoverCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int [10];
        Utilidades.rellenaArray(array1,0,10);
        for (int i : array1) System.out.print(i + " ");
        System.out.print(array1 + " ");
        System.out.println();
        int contador = 0;

        for (int i = 0; i < array1.length -1; i++){
            if (array1[i] == 0){
                for (int j = i; j < array1.length -1; j++) {
                    array1[j] = array1[j + 1];
                }
                array1[array1.length -1 -contador] = 0;
                contador++;
            }
        }

        for (int i : array1) System.out.print(i + " ");
        System.out.print(array1 + " ");
    }
}

