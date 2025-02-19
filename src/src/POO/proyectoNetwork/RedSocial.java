package POO.proyectoNetwork;

import java.util.ArrayList;
import java.util.List;

public class RedSocial {
    private List<Publicacion> publicaciones;

    public RedSocial() {
        publicaciones = new ArrayList<>();
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public List<Publicacion> buscarPublicacionesPorAutor(String autor) {
        List<Publicacion> resultado = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getAutor().equals(autor)) {
                resultado.add(publicacion);
            }
        }
        return resultado;
    }

    public void mostrarPublicacionesDe(String autor) {
        List<Publicacion> publicacionesAutor = buscarPublicacionesPorAutor(autor);
        if (publicacionesAutor.isEmpty()) {
            System.out.println("No hay publicaciones de " + autor);
        } else {
            for (Publicacion publicacion : publicacionesAutor) {
                publicacion.mostrar();
            }
        }
    }

    public void eliminarPublicacion(int id) {
        publicaciones.removeIf(publicacion -> publicacion.getId() == id);
    }
}