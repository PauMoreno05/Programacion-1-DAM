package POO.proyectoNetwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedSocial redSocial = new RedSocial();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------ Menú Principal ------");
            System.out.println("1. Crear publicacion de texto");
            System.out.println("2. Crear publicacion de foto");
            System.out.println("3. Dar me gusta a una publicacion");
            System.out.println("4. Agregar comentario a publicacion");
            System.out.println("5. Mostrar publicaciones de un usuario");
            System.out.println("6. Eliminar una publicacion");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del autor: ");
                    String autorTexto = scanner.nextLine();
                    System.out.print("Introduce el mensaje: ");
                    String mensaje = scanner.nextLine();
                    PublicacionTexto publicacionTexto = new PublicacionTexto(autorTexto, mensaje);
                    redSocial.agregarPublicacion(publicacionTexto);
                    System.out.println("Publicacion de texto creada con éxito. ID: " + publicacionTexto.getId());
                    break;

                case 2:
                    System.out.print("Introduce el nombre del autor: ");
                    String autorFoto = scanner.nextLine();
                    System.out.print("Introduce el nombre del archivo de imagen: ");
                    String archivoImagen = scanner.nextLine();
                    System.out.print("Introduce el título de la fotografía: ");
                    String titulo = scanner.nextLine();
                    PublicacionFoto publicacionFoto = new PublicacionFoto(autorFoto, archivoImagen, titulo);
                    redSocial.agregarPublicacion(publicacionFoto);
                    System.out.println("Foto creada con éxito. ID: " + publicacionFoto.getId());
                    break;

                case 3:
                    System.out.print("Introduce el ID de la publicación a la que quieres dar me gusta: ");
                    int idMeGusta = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    boolean encontradaMeGusta = false;
                    for (Publicacion publicacion : redSocial.getPublicaciones()) {
                        if (publicacion.getId() == idMeGusta) {
                            publicacion.darMeGusta();
                            System.out.println("Me gusta agregado a la publicación con ID " + idMeGusta);
                            encontradaMeGusta = true;
                            break;
                        }
                    }
                    if (!encontradaMeGusta) {
                        System.out.println("No se encontró una publicación con el ID " + idMeGusta);
                    }
                    break;

                case 4:
                    System.out.print("Introduce el ID de la publicación para agregar un comentario: ");
                    int idComentario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Introduce tu comentario: ");
                    String comentario = scanner.nextLine();
                    boolean encontradaComentario = false;
                    for (Publicacion publicacion : redSocial.getPublicaciones()) {
                        if (publicacion.getId() == idComentario) {
                            publicacion.agregarComentario(comentario);
                            System.out.println("Comentario agregado a la publicación con ID " + idComentario);
                            encontradaComentario = true;
                            break;
                        }
                    }
                    if (!encontradaComentario) {
                        System.out.println("No se encontró una publicación con el ID " + idComentario);
                    }
                    break;

                case 5:
                    System.out.print("Introduce el nombre del autor para mostrar sus publicaciones: ");
                    String autorBuscar = scanner.nextLine();
                    redSocial.mostrarPublicacionesDe(autorBuscar);
                    break;

                case 6:
                    System.out.print("Introduce el ID de la publicación a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();
                    redSocial.eliminarPublicacion(idEliminar);
                    System.out.println("Publicación eliminada (si existía).");
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}