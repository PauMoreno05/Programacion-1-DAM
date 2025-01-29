package POO.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int n_suc;
    private Banco banco;
    private Set<CuentaCorriente> cuentas;
    private Set<Prestamo> prestamos;

    public Sucursal(int n_sucl, Banco banco){
        this.n_suc = n_suc;
        this.banco = banco;
        this.cuentas = new HashSet<>();
        this.prestamos = new HashSet<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public Banco getBanco() {
        return banco;
    }
    public void addCuentas(CuentaCorriente cuentas){
        this.cuentas.add(cuentas);
    }
    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    public Set<CuentaCorriente> getCuentas() {
        return cuentas;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    @Override
    public String toString() {
        return getBanco() + " " + getN_suc();
    }
}
