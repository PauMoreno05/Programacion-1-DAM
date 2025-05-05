package gui.fin;

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
        int res3 = 0;
        int res4 = 0;

        int sal = 1;
        int sal1 = 1;
        int sal2 = 1;
        int sal3 = 1;

        try {
            con = DriverManager.getConnection(url);
            System.out.println("Se ha establecido conexion con la base de datos en local");

            while (sal != 0) {
                //Funcion para cambiar las variables de salir del bucle, asi cada vez que entre de nuevo se resetaran.
                sal = 1;
                sal1 = 1;
                sal2 = 1;
                sal3 = 1;

                //Menu principal de control de Base de Datos
                System.out.println("======================================");
                System.out.println("|| Gestor de base de datos en local ||");
                System.out.println("======================================");
                System.out.println("1. Gestion de Libros");
                System.out.println("2. Gestion de Clientes");
                System.out.println("3. Gestion de Compras");
                System.out.println("4. Crear tablas");
                System.out.println("5. Eliminar tablas");
                System.out.println("0. Salir");
                System.out.println("");
                System.out.println("Que desea hacer?: ");
                res = scanner.nextInt();

                switch (res) {
                    case 1:
                        while (sal1 != 0){

                            //Gestion de Libros
                            System.out.println(" ----- GESTION DE LIBROS -----");
                            System.out.println("1. Mostrar todos los elementos almacenados en Libros");
                            System.out.println("2. Agregar un nuevo elemento a la tabla Lirbos");
                            System.out.println("3. Actualiza el titulo de un elemento por su ISBN");
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
                                    System.out.println("Cabiar datos del titulo de un libro:");
                                    Libros.actualizarLibro();
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
                                    sal1 = 0;
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }

                    case 2:
                        while (sal2 != 0){

                            //Gestion de Clientes
                            System.out.println(" ----- GESTION DE CLIENTES -----");
                            System.out.println("1. Mostrar todos los elementos almacenados en Clientes");
                            System.out.println("2. Agregar un nuevo cliente a la tabla Clientes");
                            System.out.println("3. Actualiza la edad de un elemento por su DNI");
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
                                    System.out.println("Cambiando datos de la base de datos Clientes...");
                                    Clientes.actualizarCliente();
                                    break;
                                case 4:
                                    System.out.println("Eliminar cliente");
                                    System.out.println("Introduce el DNI del cliente a eliminar");
                                    String resCli = scanner.next();
                                    Clientes.eliminarCliente(resCli);
                                    break;
                                case 0:
                                    System.out.println("Volviendo al menu princilal");
                                    sal2 = 0;
                                    break;
                            }
                        }

                    case 3:
                        while (sal3 != 0) {

                            //Gestion de Compras
                            System.out.println(" ----- GESTION DE COMPRAS -----");
                            System.out.println("1. Mostrar todos los elementos almacenados en Compras");
                            System.out.println("2. Agregar un nuevo elemento a la tabla Locales");
                            System.out.println("3. Actualiza el Nombre de un elemento por su Cod_loc");
                            System.out.println("4. Elimina un Loclac por su Cod_loc");
                            System.out.println("5. Imprimir Compra por ID");
                            System.out.println("0. Volver al menu principal");
                            System.out.println("");
                            System.out.println("Que deseas hacer:");
                            res3 = scanner.nextInt();
                            switch (res3){
                                case 1:
                                    System.out.println("Listando Compras:");
                                    Compras.listarCompra();
                                    break;
                                case 2:
                                    System.out.println("Añadir Compra:");
                                    Compras.agregarCompra(scanner);
                                    break;
                                case 3:
                                    System.out.println("Cambiando datos de la base de datos Compra...");
                                    Compras.actualizarCompra();
                                    break;
                                case 4:
                                    System.out.println("Eliminar Compra");
                                    System.out.println("Introduce el Codigo de la compra a eliminar");
                                    String resCod = scanner.next();
                                    Compras.eliminarCompra(resCod);
                                    break;
                                case 5:
                                    Compras.imprimirCompraPorID();
                                    break;
                                case 0:
                                    System.out.println("Volviendo al menu princilal");
                                    sal3 = 0;
                                    break;
                            }
                        }

                    case 4:

                        //Crear Tablas
                        System.out.println(" ----- CREAR TABLAS -----");
                        System.out.println("1. Crear tabla Libros");
                        System.out.println("2. Crear tabla Clientes");
                        System.out.println("3. Crear tabla Compras");
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
                            case 3:
                                System.out.println("Creando la tabla Compras ...");
                                Compras.crearCrompas();
                        }
                    case 5:
                        System.out.println("No disponible por ahora, intententelo mas tarde.");
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
