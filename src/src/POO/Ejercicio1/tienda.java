package POO.Ejercicio1;

public class tienda {
    private String marca;
    private String modelo;
    private int stock;
    private double precio;

    public tienda(String marca, String modelo, int stock, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "Marca: " + this.marca + " |Modelo: " + this.modelo + " |Stock: " + this.stock + " |Precio:  " + this.precio;
    }

}
