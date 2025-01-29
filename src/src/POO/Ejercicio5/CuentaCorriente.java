package POO.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {
    private int n_cc;
    private Sucursal sucursal;
    private Set<Domicilacion> domicilaciones;
    private Set<ClienteMasCuentacorrienteTodoJunto> extras;

    public CuentaCorriente(int n_cc, Sucursal sucursal){
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.domicilaciones = new HashSet<>();
        this.extras = new HashSet<>();
    }

    public Set<ClienteMasCuentacorrienteTodoJunto> getExtras() {
        return extras;
    }

    public Set<Domicilacion> getDomicilaciones() {
        return domicilaciones;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public int getN_cc() {
        return n_cc;
    }

    public void addDomiciliacion(Domicilacion domicilaciones){
        this.domicilaciones.add(domicilaciones);
    }
    public void addExtras(ClienteMasCuentacorrienteTodoJunto extras){
        this.extras.add(extras);
    }


    @Override
    public String toString() {
        return getN_cc() + " " + getDomicilaciones() + " " + getExtras();
    }
}
