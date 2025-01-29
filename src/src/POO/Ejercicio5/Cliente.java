package POO.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String dni;
    private Set<Prestamo> prestamos;
    private Set<ClienteMasCuentacorrienteTodoJunto> extras;

    public Cliente(String dni){
        this.dni = dni;
        this.prestamos = new HashSet<>();
        this.extras = new HashSet<>();
    }
    public void addPretamos(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    public String getDni() {
        return dni;
    }

    public Set<ClienteMasCuentacorrienteTodoJunto> getExtras() {
        return extras;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addExtras(ClienteMasCuentacorrienteTodoJunto extras){
        this.extras.add(extras);
    }

    @Override
    public String toString() {
        return getDni() + " " + getPrestamos() + "" + getExtras();
    }
}
