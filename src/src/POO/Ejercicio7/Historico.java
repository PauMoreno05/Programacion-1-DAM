package POO.Ejercicio7;

public class Historico {
    private Ejemplar ejemplar;
    private Lector lector;
    private String data_p;
    private String data_t;

    public Historico(Ejemplar ejemplar, Lector lector, String data_p, String data_t){
        this.data_p = data_p;
        this.data_t = data_t;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public String getData_p() {
        return data_p;
    }

    public String getData_t() {
        return data_t;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }

    public void setData_t(String data_t) {
        this.data_t = data_t;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return getData_p()+" "+getData_t()+""+getEjemplar()+" "+getLector();
    }
}
