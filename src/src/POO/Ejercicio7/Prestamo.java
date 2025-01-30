package POO.Ejercicio7;

import java.util.Date;

public class Prestamo {
    private Date data_p;
    private Date data_t;
    private Ejemplar ejemplar;
    private Lector lector;

    public Prestamo(Date data_p, Date data_t, Ejemplar ejemplar, Lector lector) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public Date getData_p() {
        return data_p;
    }

    public Date getData_t() {
        return data_t;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setData_p(Date data_p) {
        this.data_p = data_p;
    }

    public void setData_t(Date data_t) {
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
        return getData_p()+" "+getData_t()+" "+getEjemplar()+" "+getLector();
    }
}