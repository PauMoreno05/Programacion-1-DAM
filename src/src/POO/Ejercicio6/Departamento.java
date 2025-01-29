package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String cod_dep;
    private AreaConocimiento areas;
    private Set<Catedra> catedras;
    private Set<Profesor> profesors;

    public Departamento(String cod_dep, AreaConocimiento areas){
        this.cod_dep = cod_dep;
        this.areas = areas;
        this.catedras = new HashSet<>();
        this.profesors = new HashSet<>();
    }

    public String getCod_dep() {
        return cod_dep;
    }

    public AreaConocimiento getAreas() {
        return areas;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public Set<Profesor> getProfesors() {
        return profesors;
    }

    public void setAreas(AreaConocimiento areas) {
        this.areas = areas;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void setCod_dep(String cod_dep) {
        this.cod_dep = cod_dep;
    }

    public void setProfesors(Set<Profesor> profesors) {
        this.profesors = profesors;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
    public void addProfesor(Profesor profesor){
        this.profesors.add(profesor);
    }

    @Override
    public String toString() {
        return getCod_dep() + " "+ getAreas() +" "+ getCatedras()+" "+getProfesors();
    }
}
