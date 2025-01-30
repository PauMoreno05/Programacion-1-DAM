package POO.Ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String dni;
    private Set<Prestamo> prestamos;
    private Set<Ejemplar> ejemplars;

    public Lector(String dni) {
        this.dni = dni;
        this.prestamos = new HashSet<>();
        this.ejemplars = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public void addEjemplars(Ejemplar ejemplar) {
        this.ejemplars.add(ejemplar);
    }

    @Override
    public String toString() {
        return getDni()+" "+getPrestamos();
    }
}