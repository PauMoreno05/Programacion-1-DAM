package POO.Ejercicio4;

import java.util.ArrayList;

public class mainLibro {
    public static void main(String[] args) {
        autor Autor = new autor("Alexandre Dumas", "1802");
        tema Tema = new tema("Clasico");
        libro Libro = new libro("El conde de montecristo","Alexandre Dumas",1448);
        autor Autor2 = new autor("Albert Camus", "1913");
        tema Tema2 = new tema("Clasico");
        libro Libro2 = new libro("El extranjero","Albert Camus",1448);
    }
}
