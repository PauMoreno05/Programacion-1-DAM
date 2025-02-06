package POO.Ejercicio7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       Autor autor1 = new Autor("566789");
       Tema tema1 = new Tema("dq31");
       Editorial editorial = new Editorial("awdawd");
       Libro libro1 = new Libro("24123352", tema1, editorial);
    }
}