package POO.Ejercicio3;

public class Solucion_Darius {
    // Atributos de la clase

    private String titular;
    private String numeroCuenta;
    private int saldoCuenta=0;

    // Constructores

    Solucion_Darius(String titularCuenta, String numeroCuenta) {
        setTitular(titularCuenta);
        setNumeroCuenta(numeroCuenta);
        titular=titularCuenta;
        this.numeroCuenta=numeroCuenta;
    }
    Solucion_Darius(int saldoCuenta, String titularCuenta, String numeroCuenta) {
        setTitular(titularCuenta);
        setNumeroCuenta(numeroCuenta);
        this.saldoCuenta=saldoCuenta;
        this.titular=titularCuenta;
        this.numeroCuenta=numeroCuenta;
    }

    // Metodos de la clase

    public void setSaldo(int saldo) {
        this.saldoCuenta=saldo;
    }
    public int getSaldo() {
        return this.saldoCuenta;
    }
    public void setTitular(String nombre) {
        this.titular=nombre;
    }
    public String getTitular() {
        return this.titular;
    }
    public void setNumeroCuenta(String nrCuenta) {
        this.numeroCuenta=nrCuenta;
    }
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
    public void ingresoDinero(int cantidadDinero) {
        if (cantidadDinero<=0) {
            System.out.println("Porfavor ingrese una cantidad de dinero superior a 0!");
        } else {
            this.saldoCuenta+=cantidadDinero;
            System.out.println("Se ha ingresado "+cantidadDinero+" €. Saldo restante: "+this.saldoCuenta);
        }
    }
    public void retiradaDinero(int cantidadDinero) {
        if (cantidadDinero<=0) {
            System.out.println("No puedes retirar esa cantidad!");
        } else {
            this.saldoCuenta-=cantidadDinero;
            System.out.println("Se ha retirado "+cantidadDinero+" €. Saldo restante: "+this.saldoCuenta);
        }
    }
}
