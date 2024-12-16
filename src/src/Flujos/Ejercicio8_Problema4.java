package Flujos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio8_Problema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int respuesta;

        while (true){
            System.out.println("Introduce un numero (para finalizar introduce un valor negativo)");
            respuesta = scanner.nextInt();
            if (respuesta < 0) break;
            arrayList.add(respuesta);
        }

        List<Integer> numEj = arrayList.stream()
                .filter(number -> number <= 5 && number >= 1)
                .collect(Collectors.toList());

        System.out.println(numEj);
    }
}

