package POO.sistemaDeSubastas2;

import java.util.ArrayList;
import java.util.List;

public class Lotes {
    private int numero;
    private double precioSalida;
    private List<Articulos> articulos;
    private Pujadores pujaGanadora; // Puja más alta (si la hay)

    public Lotes(int numero, double precioSalida) {
        this.numero = numero;
        this.precioSalida = precioSalida;
        this.articulos = new ArrayList<>();
        this.pujaGanadora = null;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public List<Articulos> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulos articulo) {
        articulos.add(articulo);
    }

    public Pujadores getPujaGanadora() {
        return pujaGanadora;
    }

    public void realizarPuja(Pujadores puja) {
        if (pujaGanadora == null) {
            if (puja.getMonto() >= precioSalida) {
                pujaGanadora = puja;
            }
        } else {
            if (puja.getMonto() > pujaGanadora.getMonto()) {
                pujaGanadora = puja;
            }
        }
    }

    @Override
    public String toString() {
        String resultado = "Lote " + numero + " (Precio de salida: " + precioSalida + "€)";
        resultado += "Artículos: " + articulos;
        if (pujaGanadora != null) {
            resultado += "Adjudicado a: " + pujaGanadora;
        } else {
            resultado += "No adjudicado";
        }
        return resultado;
    }
}
