package POO.proyectoNetwork;

public class PublicacionTexto extends Publicacion {
    private String mensaje;

    public PublicacionTexto(String autor, String mensaje) {
        super(autor);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void mostrar() {
        System.out.println("ID: " + getId());
        System.out.println("Autor: " + getAutor());
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Me gustas: " + getMeGustas());
        System.out.println("Comentarios: " + getComentarios());
        System.out.println("-----------------------------");
    }
}