package POO.proyectoNetwork;

import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {
    private static int siguienteId = 1;
    private int id;
    private String autor;
    private int meGustas;
    private List<String> comentarios;

    public Publicacion(String autor) {
        this.id = siguienteId++;
        this.autor = autor;
        this.meGustas = 0;
        this.comentarios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public int getMeGustas() {
        return meGustas;
    }

    public void darMeGusta() {
        meGustas++;
    }

    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public abstract void mostrar();
}