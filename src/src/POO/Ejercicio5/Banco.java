package POO.Ejercicio5;

import java.util.HashSet;

public class Banco {
    private int n_ent;
    private Sucursal sucursal;

    public Banco(int n_ent){
        this.n_ent = n_ent;
        this.sucursal = new HashSet<>();
    }

    public int getN_ent() {
        return n_ent;
    }
}
