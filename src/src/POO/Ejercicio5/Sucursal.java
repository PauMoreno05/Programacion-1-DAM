package POO.Ejercicio5;

public class Sucursal {
    private int n_suc;
    private Banco banco;

    public Sucursal(int n_sucl, Banco banco){
        this.n_suc = n_suc;
        this.banco = banco;
    }

    public int getN_suc() {
        return n_suc;
    }
}
