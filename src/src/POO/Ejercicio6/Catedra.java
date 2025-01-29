package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String cod_cat;
    private Departamento departamento;
    private Facultad facultad;
    private Set<ProfesorCatedra> profesorCatedras;

    public Catedra(String cod_cat, Departamento departamento, Facultad facultad){
        this.cod_cat = cod_cat;
        this.departamento = departamento;
        this.facultad = facultad;
        this.profesorCatedras = new HashSet<>();
    }

    public String getCod_cat() {
        return cod_cat;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public Set<ProfesorCatedra> getProfesorCatedras() {
        return profesorCatedras;
    }

    public void setCod_cat(String cod_cat) {
        this.cod_cat = cod_cat;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public void setProfesorCatedras(Set<ProfesorCatedra> profesorCatedras) {
        this.profesorCatedras = profesorCatedras;
    }
    public void addprofesorCatedras(ProfesorCatedra profesorCatedra){
        this.profesorCatedras.add(profesorCatedra);
    }

    @Override
    public String toString() {
        return getCod_cat()+" "+getDepartamento()+" "+getFacultad()+" "+getProfesorCatedras();
    }
}
