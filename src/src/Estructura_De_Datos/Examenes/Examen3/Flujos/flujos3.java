package Estructura_De_Datos.Examenes.Examen3.Flujos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class flujos3 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        personas.add(new Person("Pau", "Fores", 1971));
        personas.add(new Person("Foga", "Gay", 2098));
        personas.add(new Person("Pau", "Fores", 1971));
        personas.add(new Person("Foga", "Gay", 2098));

        List<String> lista = personas.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(lista);
    }
}
