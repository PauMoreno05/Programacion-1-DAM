package POO.proyectoNetwork;

public class PublicacionFoto extends Publicacion {
    private String archivoImagen;
    private String titulo;

    public PublicacionFoto(String autor, String archivoImagen, String titulo) {
        super(autor);
        this.archivoImagen = archivoImagen;
        this.titulo = titulo;
    }

    public String getArchivoImagen() {
        return archivoImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void mostrar() {
        System.out.println("ID: " + getId());
        System.out.println("Autor: " + getAutor());
        System.out.println("Título: " + titulo);
        System.out.println("Imagen: " + archivoImagen);
        System.out.println("Me gustas: " + getMeGustas());
        System.out.println("Comentarios: " + getComentarios());
        System.out.println("-----------------------------");
    }
}