package database.local;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:sqlite:Libreria.db";
        Connection con = null;
        int res = 0;
        int res1 = 0;
        int res2 = 0;
        int res4 = 0;

        int sal = 1;
        int sal1 = 1;
        int sal2 = 1;

        try {
            con = DriverManager.getConnection(url);
            System.out.println("Se ha establecido conexion con la base de datos en local");

            while (sal != 0) {
                System.out.println("======================================");
                System.out.println("|| Gestor de base de datos en local ||");
                System.out.println("======================================");
                System.out.println("1. Gestion de Libros");
                System.out.println("2. Gestion de Clientes");
                System.out.println("3. Gestion de Locales");
                System.out.println("4. Crear tablas");
                System.out.println("5. Eliminar tablas");
                System.out.println("0. Salir");
                System.out.println("");
                System.out.println("Que desea hacer?: ");
                res = scanner.nextInt();

                switch (res) {
                    case 1:
                        while (sal1 != 0){
                            System.out.println(" ----- GESTION DE LIBROS -----");
                            System.out.println("1. Mostrar todos los elementos almacenados en Libros");
                            System.out.println("2. Agregar un nuevo elemento a la tabla Lirbos");
                            System.out.println("3. Actualiza un campo de un elemento por su ISBN");
                            System.out.println("4. Elimina un elemento por su ISBN");
                            System.out.println("0. Volver al menu principal");
                            System.out.println("");
                            System.out.println("Que deseas hacer:");
                            res1 = scanner.nextInt();
                            switch (res1){
                                case 1:
                                    System.out.println("Listando Libros");
                                    Libros.listarLibros();
                                    break;
                                case 2:
                                    System.out.println("Agrega Libro:");
                                    Libros.agregarLibro(scanner);
                                    break;
                                case 3:
                                    System.out.println("No me ha dado tiempo a programar esta opcion");
                                    break;
                                case 4:
                                    System.out.println("Eliminar articulo");
                                    System.out.println("Introduce el isbn del libro que deseas eliminar");
                                    int resISBN = scanner.nextInt();
                                    Libros.eliminarLibro(resISBN);
                                    System.out.println("Libro eliminado correctamente");
                                    break;
                                case 0:
                                    System.out.println("Volviendo al menu principal");
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }

                    case 2:
                        while (sal2 != 0){
                            System.out.println(" ----- GESTION DE CLIENTES -----");
                            System.out.println("1. Mostrar todos los elementos almacenados en Clientes");
                            System.out.println("2. Agregar un nuevo cliente a la tabla Clientes");
                            System.out.println("3. Actualiza un campo de un elemento por su DNI");
                            System.out.println("4. Elimina un elemento por su DNI");
                            System.out.println("0. Volver al menu principal");
                            System.out.println("");
                            System.out.println("Que deseas hacer:");
                            res2 = scanner.nextInt();
                            switch (res2){
                                case 1:
                                    System.out.println("Listando Clientes:");
                                    Clientes.listarClientes();
                                    break;
                                case 2:
                                    System.out.println("Añadir cliente:");
                                    Clientes.agregarCliente(scanner);
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    System.out.println("Eliminar cliente");
                                    System.out.println("Introduce el DNI del cliente a eliminar");
                                    String resCli = scanner.next();
                                    break;
                                case 0:
                                    System.out.println("Volviendo al menu princilal");
                                    sal2 = 0;
                                    break;
                            }
                        }

                    case 3:
                        System.out.println(" ----- GESTION DE LOCALES -----");
                        break;
                    case 4:
                        System.out.println(" ----- CREAR TABLAS -----");
                        System.out.println("1. Crear tabla Libros");
                        System.out.println("2. Crear tabla Clientes");
                        System.out.println("3. Crear tabla Locales");
                        System.out.println("4. Volver al menu principal");
                        System.out.println("");
                        System.out.println("Que deseas hacer");
                        res4 = scanner.nextInt();

                        switch (res4){
                            case 1:
                                System.out.println("Creando tabla Libros ...");
                                Libros.crearLibros();
                                break;
                            case 2:
                                System.out.println("Creando tabla Clientes ...");
                                Clientes.crearClientes();
                        }
                    case 5:
                        System.out.println("Saliendo del programa");
                        sal = 5;
                        break;
                    case 6:
                        System.out.println("Saliendo del programa");
                        sal = 6;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());

        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
    }
}
