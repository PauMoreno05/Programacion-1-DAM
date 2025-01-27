package Estructura_De_Datos.Examenes.Examen3.Flujos;

import java.util.ArrayList;

public class flujos2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        personas.add(new Person("Pau", "Fores", 1971));
        personas.add(new Person("Foga", "Gay", 2098));

        long conteo = personas.stream()
                .filter(person -> person.getLastName().startsWith("A"))
                .count();
        System.out.println(conteo);
    }
}
