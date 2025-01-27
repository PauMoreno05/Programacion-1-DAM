//Número Áureo

public class Ejemplo33 {
    public static void main(String[] args) {
        System.out.println("Número aureo usando la serie de Fibonacci:");
        int numero = 40;
        double aureo;
        System.out.print("0 1");
        int s = 0;
        int f = 1;
        int sigNumero;
        while (numero > 2) {
            sigNumero = s;
            s = f;
            f = sigNumero + f;
            System.out.print(" " + f);
            if (s != 0) {
                aureo = (double) f / s;
                System.out.println("Relación Áurea: " + aureo);
            }
            numero--;
        }
        System.out.println();
    }
}
