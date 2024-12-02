import java.util.Scanner;

public class Ejercicio4_Positivos2 {
    public static int calculo(int[] numeros, int contador) {
        for (int i : numeros){
            if (i >= 0){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introdue un numero");
            numeros[i] = scanner.nextInt();
        }
        System.out.println(calculo(numeros, contador));

    }
}

