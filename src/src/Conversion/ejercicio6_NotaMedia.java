import java.util.Arrays;

public class ejercicio6_NotaMedia {
    public static double calcularMedia(int[] numeros) {
        int sumaNumeros = 0;
        for (int num : numeros) {
            sumaNumeros += num;
        }
        return ((double) sumaNumeros / (double) numeros.length);
    }
    public static boolean hayUnNumero(int[] numeros, int numeroBuscado) {
        for (int num : numeros) {
            if (num == numeroBuscado) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] notas = new int[10];
        Utilidades.rellenaArray(notas, 1, 10);
        System.out.println(Arrays.toString(notas));
        System.out.println("la nota media es de: " + calcularMedia(notas));
        if (hayUnNumero(notas, 10)) System.out.println("Hay un diez en las notas");
    }
}



