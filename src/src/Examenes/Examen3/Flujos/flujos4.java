package Examenes.Examen3.Flujos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class flujos4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> personas = new ArrayList<>();
        int numero;

        while (true) {
            System.out.println("Introduce un numero para aladir a la lista");
            numero = scanner.nextInt();
            if (numero == 0){
                break;
            }
            personas.add(numero);
        }
        List<Integer> lista = personas.stream()
                .filter(n -> n >= 1 && n <= 5)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(lista);

    }
}
