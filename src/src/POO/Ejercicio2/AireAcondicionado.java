package POO.Ejercicio2;

public class AireAcondicionado {
    private String nombre;
    private int temperaturaMax;
    private int temperaturaMin;
    private int temperaturaActual;

    public AireAcondicionado(String nombre, int temperaturaMax, int temperaturaMin, int temperaturaActual){
        this.nombre = nombre;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaActual = temperaturaActual;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public int getTemperaturaMin() {
        return temperaturaMin;
    }
    public int getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemperaturaActual(int temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public void botonSubir(){
        if (temperaturaActual < temperaturaMax) setTemperaturaActual(temperaturaActual+1);

    }

    public void botonBajar(){
        if (temperaturaActual > temperaturaMin) setTemperaturaActual(temperaturaActual-1);
    }
    @Override
    public String toString(){
        return "Marca: " + this.nombre + " |Temperatura Maxima " + this.temperaturaMax + " |Temperatura Minima:  " + this.temperaturaMin + " |Tmeperatura Actual: " + this.temperaturaActual;
    }

}
