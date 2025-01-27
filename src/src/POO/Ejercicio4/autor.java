package POO.Ejercicio4;

public class autor {
    private String nombre;
    private String fechaNacimiento;

    public autor(String nombre, String fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}


