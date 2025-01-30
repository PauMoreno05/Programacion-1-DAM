package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Ejemplar {
    private String n_reg;
    private Libro libro;
    private Prestamo prestamo;

    public Ejemplar(String cod_e, Libro libro, Prestamo prestamo) {
        this.n_reg = cod_e;
        this.libro = libro;
        this.prestamo = prestamo;
    }

    public String getCod_e() {
        return n_reg;
    }

    public Libro getLibro() {
        return libro;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void setCod_e(String cod_e) {
        this.n_reg = cod_e;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }


    @Override
    public String toString() {
        return getCod_e()+" "+getLibro()+" "+getPrestamo();
    }
}