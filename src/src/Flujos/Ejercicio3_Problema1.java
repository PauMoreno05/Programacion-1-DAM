package Flujos;
import javax.naming.BinaryRefAddr;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3_Problema1 {
    public static void main(String[] args) {
        ArrayList<Ejercicio3_Problema1> people = new ArrayList<>();
        people.add(new Ejercicio3_Problema1("Juan", "Perez", 1965));
        people.add(new Ejercicio3_Problema1("Maria", "Gomez", 1975));
        people.add(new Ejercicio3_Problema1("Luis", "Martinez", 1980));
        people.add(new Ejercicio3_Problema1("Ana", "Lopez", 1968));

        long cuantasAntes = people.stream()
                .mapToInt(s -> Integer.valueOf(s.getBirthYear()))
                .filter( number -> number < 1970 )
                .count();

        System.out.println("Numero de personas nacidas despues del 1970: " + cuantasAntes);
    }


    private String firstName;
    private String lastName;
    private int birthYear;

    public Ejercicio3_Problema1(String firstName, String lastName, int birthYear) {
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

