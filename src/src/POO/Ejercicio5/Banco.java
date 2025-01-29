package POO.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private int n_ent;
    private Set<Sucursal> sucursales;

    public Banco(int n_ent){
        this.n_ent = n_ent;
        this.sucursales = new HashSet<>();
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    public int getN_ent() {
        return n_ent;
    }


    @Override
    public String toString() {
        return getN_ent() + " " + getSucursales();
    }
}
