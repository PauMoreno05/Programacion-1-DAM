package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Facultad {
    private String cod_fac;
    private Set<Catedra> catedras;

    public Facultad(String cod_fac){
        this.cod_fac = cod_fac;
        this.catedras = new HashSet<>();
    }

    public String getCod_fac() {
        return cod_fac;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void setCod_fac(String cod_fac) {
        this.cod_fac = cod_fac;
    }

    public void addCatedras(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return getCod_fac()+" "+getCatedras();
    }
}
