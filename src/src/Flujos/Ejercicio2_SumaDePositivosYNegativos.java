package Flujos;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2_SumaDePositivosYNegativos {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();

        numeros.add("100");
        numeros.add("-50");
        numeros.add("100");
        numeros.add("-50");

        // Contamos los múltiples de 3
        long cuantosPos = numeros.stream()
                //convertimos a Int
                .mapToInt(s -> Integer.valueOf(s))
                //filtramos los que sean positivos
                .filter(number -> number >= 0)
                //y los contamos
                .count();

        long cuantosNeg = numeros.stream()
                //convertimos a Int
                .mapToInt(s -> Integer.valueOf(s))
                //filtramos los que sean negatiivos
                .filter(number -> number < 0)
                //y los contamos
                .count();

        System.out.println("Numeores negativos: " + cuantosNeg + " | Numeros positivos: " + cuantosPos );

    }
}

