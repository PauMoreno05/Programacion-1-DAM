package POO.sistemaDeSubastas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotes {
    private String dia;
    private String idLote;
    private double precioSalida;
    private Set<Articulos> articulos;

    public Lotes(String dia,String idLote, double precioSalida){
        this.dia = dia;
        this.idLote = idLote;
        this.precioSalida = precioSalida;
        this.articulos = new HashSet<>();
    }

    public String getDia() {
        return dia;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public String getIdLote() {
        return idLote;
    }

    public void setArticulos(Set<Articulos> articulos) {
        this.articulos = articulos;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void addArticulos(Articulos articulos) {
        this.articulos.add(articulos);
    }
}
