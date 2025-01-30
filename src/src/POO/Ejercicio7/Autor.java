package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String cod_aut;
    private Set<Libro> libros;

    public Autor(String cod_aut) {
        this.cod_aut = cod_aut;
        this.libros = new HashSet<>();
    }

    public String getCod_aut() {
        return cod_aut;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setCod_aut(String cod_aut) {
        this.cod_aut = cod_aut;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return getCod_aut()+" "+getLibros();
    }
}