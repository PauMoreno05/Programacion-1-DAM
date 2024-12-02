import java.util.Scanner;

public class Ejercicio10_ValoresCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int [10][10];
        Utilidades.rellenaMatriz(matriz,0,0);
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

