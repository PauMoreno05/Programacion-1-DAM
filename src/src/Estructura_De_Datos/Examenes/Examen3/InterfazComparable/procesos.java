package Estructura_De_Datos.Examenes.Examen3.InterfazComparable;

public class procesos {
    private int prioridad;
    private int duracion;

    public procesos (int prioridad, int duracion){
        this.prioridad=prioridad;
        this.duracion=duracion;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public int getDuracion(){
        return duracion;
    }
}
