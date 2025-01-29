package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private String cod_pro;
    private Departamento departamento;
    private Set<ProfesorCatedra> profesorCatedras;

    public Profesor(String cod_pro, Departamento departamento){
        this.cod_pro = cod_pro;
        this.departamento = departamento;
        this.profesorCatedras = new HashSet<>();
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Set<ProfesorCatedra> getProfesorCatedras() {
        return profesorCatedras;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public void setProfesorCatedras(Set<ProfesorCatedra> profesorCatedras) {
        this.profesorCatedras = profesorCatedras;
    }
    public void addprofesorCatedras(ProfesorCatedra profesorCatedra){
        this.profesorCatedras.add(profesorCatedra);
    }

    @Override
    public String toString() {
        return getCod_pro()+" "+getDepartamento()+" "+getProfesorCatedras();
    }
}
