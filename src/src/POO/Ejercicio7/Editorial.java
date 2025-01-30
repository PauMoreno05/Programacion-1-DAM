package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private String cod_ed;
    private Set<Libro> libros;

    public Editorial(String cod_ed) {
        this.cod_ed = cod_ed;
        this.libros = new HashSet<>();
    }

    public String getCod_ed() {
        return cod_ed;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setCod_ed(String cod_ed) {
        this.cod_ed = cod_ed;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return getCod_ed()+" "+getLibros();
    }
}