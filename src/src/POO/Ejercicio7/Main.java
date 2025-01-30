package POO.Ejercicio7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear temas
        Tema tema1 = new Tema("T1");
        Tema tema2 = new Tema("T2");

        // Crear autores
        Autor autor1 = new Autor("A1");
        Autor autor2 = new Autor("A2");

        // Crear editoriales
        Editorial editorial1 = new Editorial("E1");
        Editorial editorial2 = new Editorial("E2");

        // Crear libros
        Libro libro1 = new Libro("123456", 1, tema1, editorial1);
        Libro libro2 = new Libro("654321", 2, tema2, editorial2);

        // Añadir autores a los libros
        libro1.addAutor(autor1);
        libro2.addAutor(autor2);


        // Crear lectores
        Lector lector1 = new Lector("12345678A");
        Lector lector2 = new Lector("87654321B");


        // Imprimir información
        System.out.println(tema1);
        System.out.println(tema2);

        System.out.println(autor1);
        System.out.println(autor2);

        System.out.println(editorial1);
        System.out.println(editorial2);

        System.out.println(libro1);
        System.out.println(libro2);



        System.out.println(lector1);
        System.out.println(lector2);


    }
}