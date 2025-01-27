import Estructura_De_Datos.Utilidades.Utilidades;

public static int valorMasGrande(int num1, int num2) {
    if (num1 > num2) {
        return num1;
    } else {
        return num2;
    }
}
public static void main(String argv[]) {
    int numero = Utilidades.leerEntero("Introduce un número entero:");
    int numero2 = Utilidades.leerEntero("Introduce otro número entero:");

    System.out.println("Numero mayor: " + valorMasGrande(numero, numero2));
}

