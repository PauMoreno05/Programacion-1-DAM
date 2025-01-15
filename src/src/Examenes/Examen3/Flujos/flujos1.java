package Examenes.Examen3.Flujos;

import java.util.ArrayList;
import java.util.Map;

public class flujos1 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        personas.add(new Person("Pau", "Fores", 1971));
        personas.add(new Person("Foga", "Gay", 2098));

        long conteo = personas.stream()
                .filter(person -> person.getBirthYear() >= 1970)
                .count();
        System.out.println(conteo);
    }
}
