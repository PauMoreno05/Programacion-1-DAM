package POO.sistemaDeSubastas2;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private String fecha;
    private List<Lotes> lotes;

    public Subasta(String fecha) {
        this.fecha = fecha;
        this.lotes = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public List<Lotes> getLotes() {
        return lotes;
    }

    public void addLote(Lotes lote) {
        lotes.add(lote);
    }

    public void cerrarSubasta() {
        System.out.println("Subasta cerrada para la fecha: " + fecha);
    }

    public void imprimirResultados() {
        System.out.println("Resultados de la subasta del " + fecha + ":");
        for (Lotes lote : lotes) {
            System.out.println(lote);
            System.out.println("---------------");
        }
    }
}
