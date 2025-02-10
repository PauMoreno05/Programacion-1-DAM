package POO.maquinaExpendedora;

public class MaquinaExpendedora {
    private double precioTicket;
    private double cajon;
    private double dineroInsertado;

    public MaquinaExpendedora(double precioTicket) {
        this.precioTicket = precioTicket;
        this.cajon = 10;
        this.dineroInsertado = 0;
    }

    public double getPrecioTicket() {
        return precioTicket;
    }

    public double getCajon() {
        return cajon;
    }

    public double getDineroInsertado() {
        return dineroInsertado;
    }

    public void setCajon(double cajon) {
        this.cajon = cajon;
    }

    public void setDineroInsertado(double dineroInsertado) {
        this.dineroInsertado = dineroInsertado;
    }

    public void setPrecioTicket(double precioTicket) {
        this.precioTicket = precioTicket;
    }

    public void insertarDinero(double importe) {
        dineroInsertado += importe;
        System.out.println("Has insertado: " + importe + "€ | Total ingresado: " + dineroInsertado + "€");
    }

    public String expenderTicket() {
        if (dineroInsertado >= precioTicket) {
            double cambio = dineroInsertado - precioTicket;
            cajon += precioTicket;
            dineroInsertado = 0;
            return "Ticket emitido. " + calcularCambio(cambio);
        } else {
            return "Fondos insuficientes. Faltan " + (precioTicket - dineroInsertado) + "€.";
        }
    }

    private String calcularCambio(double cambio) {
        double[] valores = {50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10};
        String resultado = "Cambio: " + cambio + "€ (";

        for (double valor : valores) {
            if (cambio >= valor) {
                int cantidad = (int) (cambio / valor);
                cambio -= cantidad * valor;
                resultado += cantidad + " x " + valor + "€, ";
            }
        }

        return resultado.substring(0, resultado.length() - 2) + ")";
    }
}
