import java.util.Scanner;

public class Ejercicio4_Positivos {
    public static void calculo(int[] numeros) {
        int contador = 0;
        for (int i : numeros){
            if (i >= 0){
                contador++;
            }
        }
        System.out.println(contador + " numeros positivos");
    }

    public static void main(String[] args) {
        int[] numeros= new int[10];

        Scanner scanner = new Scanner (System.in);

        for (int i = 0; i < numeros.length; i ++) {
            System.out.println("Introduce un numero");
            numeros[i] = scanner.nextInt();
        }
        calculo(numeros);
    }
}

