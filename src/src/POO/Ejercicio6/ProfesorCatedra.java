package POO.Ejercicio6;

public class ProfesorCatedra {
    private Catedra catedra;
    private Profesor profesor;
    private String data;

    public ProfesorCatedra(Catedra catedra, Profesor profesor, String data){
        this.catedra = catedra;
        this.profesor = profesor;
        this.data = data;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getData() {
        return data;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return getData()+" "+getCatedra()+" "+getProfesor();
    }
}
