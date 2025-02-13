package POO.sistemaDeSubastas;

public class Articulos {
    private String nombre;
    private double precio;
    private Lotes lote;

    public Articulos(String nombre, double precio, Lotes lote){
        this.lote = lote;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Lotes getLote() {
        return lote;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setLote(Lotes lote) {
        this.lote = lote;
    }
}
