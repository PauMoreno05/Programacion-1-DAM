package Estructura_De_Datos.Conversion;

import java.util.Arrays;

public class ejercicio5_EncontrarUnValor {
    public static boolean estaEnElArray(int[] numeros, int numeroABuscar) {
        for (int num : numeros) {
            if (num == numeroABuscar) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int numeroBuscado;
        Utilidades.rellenaArray(numeros, -10, 10);
        System.out.println(Arrays.toString(numeros));
        numeroBuscado = Utilidades.leerEntero("Introduce un número a buscar");
        if (estaEnElArray(numeros, numeroBuscado)) {
            System.out.printf("El número está en el array", numeroBuscado);
        } else {
            System.out.printf("El número NO está en el array", numeroBuscado);
        }
    }


}
