package Estructura_De_Datos.Flujos;
import java.util.ArrayList;

public class Ejercicio7_Problema3 {
    public static void main(String[] args) {
        ArrayList<Ejercicio7_Problema3> people = new ArrayList<>();

        people.add(new Ejercicio7_Problema3("Pau", "Moreno", 2005));
        people.add(new Ejercicio7_Problema3("Maria", "Gomez", 1975));
        people.add(new Ejercicio7_Problema3("Pau", "Moreno", 2005));
        people.add(new Ejercicio7_Problema3("Ana", "Lopez", 1968));

//        List<String> nombres = people.stream()
//                .filter(s -> s.getFirstName())
////                .collect(Collector


    }
    private String firstName;
    private String lastName;
    private int birthYear;

    public Ejercicio7_Problema3(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }
}

