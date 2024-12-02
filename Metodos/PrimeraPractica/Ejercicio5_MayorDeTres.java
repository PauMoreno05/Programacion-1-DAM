import java.util.Scanner;

public class Ejercicio5_MayorDeTres {
    public static void calculo(int[] numeros) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        for (int i = 0; i < numeros.length; i++){
            if (valor < numeros[i]){
                valor = numeros[i];
            }
        }
        System.out.println(valor);
    }

    public static void main(String[] args) {
        int[] numeros= new int[3];

        Scanner scanner = new Scanner (System.in);

        for (int i = 0; i < numeros.length; i ++) {
            System.out.println("Introduce un numero");
            numeros[i] = scanner.nextInt();
        }
        calculo(numeros);
    }
}

