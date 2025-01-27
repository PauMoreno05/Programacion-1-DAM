package POO.Ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, int cantidad){
        this.cantidad = cantidad;
        this.titular = titular;
    }
    public Cuenta(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0) this.cantidad += cantidad;
    }
    public void retirar(double cantidad){
        if (cantidad < this.cantidad){
            this.cantidad += cantidad;
        } else if (cantidad > this.cantidad) {
            this.cantidad = 0;
        }
    }

    @Override
    public String toString(){
        return this.titular + " " + this.cantidad;
    }
}
