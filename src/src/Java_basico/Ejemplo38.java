//JUego adivina el numero

import java.util.Scanner;
import java.util.Random;
public class Ejemplo38 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numeroTecla = 0;
        Random aleatorio = new Random(System.currentTimeMillis());
        int random = aleatorio.nextInt(100);

        //System.out.println(random);
        //Descomentar arriba para saber el numero aleaorio, para hacer purevas

        for (int j = 0; numeroTecla != random || numeroTecla != -1; ) {
            System.out.println("Intenta adivinar el numero aleatorio entre en 1 y el 100 (para rendirte escribe -1)");
            numeroTecla = inputValue.nextInt();
            for (int i = 0; i != -1 || i == random; ) {
                if (numeroTecla < random) {
                    System.out.println("El numero introducido es menor al numero a adivinar");
                    break;
                }
                if (numeroTecla > random) {
                    System.out.println("El numero introducido es mayor al numero a adivinar");
                    break;
                }
                if (numeroTecla == random) {
                    System.out.println("¡¡Has ganado!!");
                    break;
                }
            }
        if (numeroTecla == random || numeroTecla == -1){
            break;
        }
        }
    }
}