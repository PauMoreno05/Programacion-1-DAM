package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class AreaConocimiento {
    private String cod_area;
    private Set<Departamento> departamentos;

    public AreaConocimiento(String cod_area){
        this.cod_area = cod_area;
        this.departamentos = new HashSet<>();
    }

    public String getCod_area() {
        return cod_area;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setCod_area(String cod_area) {
        this.cod_area = cod_area;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    @Override
    public String toString() {
        return getCod_area() + " " + getDepartamentos();
    }
}
