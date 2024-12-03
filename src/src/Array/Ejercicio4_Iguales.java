import java.util.Scanner;

public class Ejercicio4_Iguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int [10];
        int[] array2 = new int [10];
        boolean igual = false;
        Utilidades.rellenaArray(array1, 1, 10);
        array2 = array1.clone(); //metodo para clonar el array a otro.
        for (int i : array1) System.out.print(i);
        System.out.println();
        for (int i : array2) System.out.print(i);
        for (int i = 0; i < array1.length; i++){
            if (array1[i] != array2[i]){
                igual = false;
                break;
            }else {
                igual = true;
            }
        }
        System.out.println();
        if (igual == true){
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son diferentes");
        }

    }
}

