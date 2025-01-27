package Estructura_De_Datos.Examenes.Examen3.Flujos;

import java.util.*;
import java.util.stream.Collectors;

public class ExemplosFlujos {
    public static void main(String[] args) {
        // Crear una lista de objetos Person
        ArrayList<Person> personas = new ArrayList<>();
        personas.add(new Person("Pau", "Fores", 1971)); // Persona nacida en 1971
        personas.add(new Person("Foqa", "Gay", 2098)); // Persona nacida en 2098
        personas.add(new Person("Anna", "Smith", 1985)); // Persona nacida en 1985
        personas.add(new Person("John", "Doe", 1975)); // Persona nacida en 1975
        personas.add(new Person("Foqa", "Gay", 2098)); // Repetida para probar "distinct"

        // 1. Filtrar personas nacidas antes del año 2000
        List<Person> filtradas = personas.stream()
                .filter(person -> person.getBirthYear() < 2000) // Condición de filtrado
                .collect(Collectors.toList()); // Convertir a una lista
        System.out.println("Personas nacidas antes de 2000:");
        filtradas.forEach(System.out::println); // Imprimir cada persona filtrada

        // 2. Obtener nombres completos y ordenarlos por apellido
        List<String> nombresCompletos = personas.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName()) // Crear nombres completos
                .sorted(Comparator.comparing(name -> name.split(" ")[1])) // Ordenar por apellido
                .collect(Collectors.toList()); // Convertir a una lista
        System.out.println("\nNombres completos ordenados por apellido:");
        nombresCompletos.forEach(System.out::println); // Imprimir nombres completos ordenados

        // 3. Agrupar personas por año de nacimiento
        Map<Integer, List<Person>> agrupadasPorAño = personas.stream()
                .collect(Collectors.groupingBy(Person::getBirthYear)); // Agrupar por año
        System.out.println("\nPersonas agrupadas por año de nacimiento:");
        agrupadasPorAño.forEach((year, list) -> {
            System.out.println(year + ": " + list); // Imprimir año y lista de personas en ese año
        });

        // 4. Contar cuántas personas tienen nombres únicos
        long nombresUnicos = personas.stream()
                .map(Person::getFirstName) // Obtener solo los nombres
                .distinct() // Eliminar duplicados
                .count(); // Contar cuántos nombres únicos hay
        System.out.println("\nCantidad de nombres únicos: " + nombresUnicos);

        // 5. Verificar si todas las personas nacieron después de 1900
        boolean todosDespuesDe1900 = personas.stream()
                .allMatch(person -> person.getBirthYear() > 1900); // Verificar condición para todos
        System.out.println("\n¿Todas las personas nacieron después de 1900? " + todosDespuesDe1900);

        // 6. Encontrar la persona más joven
        Optional<Person> personaMasJoven = personas.stream()
                .min(Comparator.comparingInt(Person::getBirthYear)); // Encontrar el menor año
        personaMasJoven.ifPresent(person -> System.out.println("\nPersona más joven: " + person));

        // 7. Sumar todos los años de nacimiento
        int sumaAños = personas.stream()
                .mapToInt(Person::getBirthYear) // Convertir cada año a int
                .sum(); // Sumar todos los años
        System.out.println("\nSuma de todos los años de nacimiento: " + sumaAños);
    }
}


