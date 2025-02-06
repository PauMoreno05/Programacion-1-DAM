package POO.laboratorio;

import java.util.HashSet;
import java.util.Set;

public class Lab {
    private String nombre;
    private String taller;
    private int capMax;
    private String hora;
    private String dia;
    private String profesor;
    private Set<String> alumnos;

    public Lab(String nombre, String taller, String hora, String dia, int getCapMax,String profesor ){
        this.nombre = nombre;
        this.taller = taller;
        this.capMax = getCapMax;
        this.hora = hora;
        this.dia = dia;
        this.profesor = profesor;
        this.alumnos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapMax() {
        return capMax;
    }

    public String getTaller() {
        return taller;
    }

    public String getHora() {
        return hora;
    }

    public String getDia() {
        return dia;
    }

    public Set<String> getAlumnos() {
        return alumnos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public void addAlumnos(String alumnos) {
        this.alumnos.add(alumnos);
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "|Alula: "+getNombre()+" |taller: "+getTaller()+"  |Capacidad maxima: "+getCapMax()+" |Dia: "+getDia()+" |Hora: " +getHora()+" |Profesor: "+getProfesor()+" |Alumnos " +getAlumnos();
    }
}
