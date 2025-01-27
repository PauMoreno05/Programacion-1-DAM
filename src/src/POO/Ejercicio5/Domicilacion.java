package POO.Ejercicio5;

public class Domicilacion {
    private int num_d;
    private CuentaCorriente cuentaCorriente;

    public Domicilacion(int num_d, CuentaCorriente cuentaCorriente){
        this.num_d = num_d;
        this.cuentaCorriente = cuentaCorriente;
    }

    public int getNum_d() {
        return num_d;
    }
}
