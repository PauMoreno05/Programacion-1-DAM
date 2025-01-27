package POO.Ejercicio5;

public class CuentaCorriente {
    private int n_cc;
    private Sucursal sucursal;

    public CuentaCorriente(int n_cc, Sucursal sucursal){
        this.n_cc = n_cc;
        this.sucursal = sucursal;
    }

    public int getN_cc() {
        return n_cc;
    }
}
