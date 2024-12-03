//Numeros Primos
import java.util.Scanner;
public class Ejemplo28 {
    public static void main(String[] args) {
        boolean esPrimo = true;
        Scanner inputValue = new Scanner(System.in);
        int contador = 1;
        System.out.println("Introduce un numero");
        int numero = inputValue.nextInt();

        if (numero % 2 == 0){
            esPrimo = false;
        }
        for (int i = 3; i <= numero/2; i+=2){
            if (numero % i == 0){
                esPrimo = false;
                break;
            }
        }
        if (esPrimo == true){
            System.out.println(numero + " es primo.");
        }else {
            System.out.println(numero + " no es primo");
        }
    }
}
