package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private String cod_t;
    private Set<Libro> libros;

    public Tema(String cod_t) {
        this.cod_t = cod_t;
        this.libros = new HashSet<>();
    }

    public String getCod_t() {
        return cod_t;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setCod_t(String cod_t) {
        this.cod_t = cod_t;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return getCod_t()+" "+getLibros();
    }
}