package Estructura_De_Datos.Array;

public class Ejercicio2_Comunes {
    public static void main(String[] args) {
        int[] num1 = new int [10];
        int[] num2 = new int [10];
        int[] repes = new int [10];
        Utilidades.rellenaArray(num1, 1, 10);
        Utilidades.rellenaArray(num2, 1, 10);
        System.out.println();
        for (int num :num1){
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : num2){
            System.out.print(num + " ");
        }
        for(int i = 0; i < num1.length; i++){
            for (int j = 0; j <num2.length; j++){
                if (num1[i] == num2[j]){
                    repes[i] = num1[i];
                }
            }
        }
        System.out.println();
        for (int sal : repes){
            System.out.print(sal + " ");
        }
    }
}

