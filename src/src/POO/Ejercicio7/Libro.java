package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String isbn;
    private Tema tema;
    private Set<Autor> autores;
    private Set<Ejemplar> ejemplares;
    private Editorial editorial;

    public Libro(String isbn, Tema tema, Editorial editorial) {
        this.isbn = isbn;
        this.tema = tema;
        this.editorial = editorial;
        this.autores = new HashSet<>();
        this.ejemplares = new HashSet<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public Tema getTema() {
        return tema;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }

    public void addEjemplar(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return getIsbn();
    }
}