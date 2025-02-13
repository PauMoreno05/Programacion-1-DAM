package POO.sistemaDeSubastas2;

public class Pujadores {
    private String pujador;
    private double monto;

    public Pujadores(String pujador, double monto) {
        this.pujador = pujador;
        this.monto = monto;
    }

    public String getPujador() {
        return pujador;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return pujador + " - " + monto + "€";
    }
}
