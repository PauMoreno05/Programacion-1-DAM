package POO.Ejercicio5;

public class ClienteMasCuentacorrienteTodoJunto {
    private String set;
    private CuentaCorriente cuentaCorrientes;
    private Cliente clientes;

    public ClienteMasCuentacorrienteTodoJunto(String set, CuentaCorriente cuentaCorrientes, Cliente clientes){
        this.set = set;
        this.cuentaCorrientes = cuentaCorrientes;
        this.clientes = clientes;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public CuentaCorriente getCuentaCorrientes() {
        return cuentaCorrientes;
    }

    public String getSet() {
        return set;
    }

}
