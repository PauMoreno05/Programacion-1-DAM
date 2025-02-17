package POO.proyectoTrabajadores;

public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Operario: "+getNombre();
    }
}
