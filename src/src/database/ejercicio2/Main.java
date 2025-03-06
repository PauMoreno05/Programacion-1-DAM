package database.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salir = 0;
        int resMenu = 0;

        while (salir != 9) {
            System.out.println("=================================================");
            System.out.println("Bienvenido al gestor de Base de Datos IES CAMINAS");
            System.out.println("=================================================");
            System.out.println("1. Listar clientes");
            System.out.println("2. Listar facturas con líneas");
            System.out.println("3. Listar artículos y categorías");
            System.out.println("4. Agregar cliente");
            System.out.println("5. Agregar artículo");
            System.out.println("6. Eliminar artículo");
            System.out.println("7. Modificar precio de artículo");
            System.out.println("8. Agregar población");
            System.out.println("9. SALIR");
            System.out.print("Elige una opción para continuar: ");
            resMenu = scanner.nextInt();
            scanner.nextLine();

            switch (resMenu){
                case 1:
                    System.out.println("Listando clientes:");
                    database.ejercicio2.Client.listarClientes();
                    break;

                case 2:
                    System.out.println("Listando Lina_fac");
                    LiniaFac.listarLiniaFac();
                    break;

                case 3:
                    System.out.println("Listando articulos:");
                    database.ejercicio2.Article.listarArticulos();
                    System.out.println();
                    System.out.println("Listando Categorias");
                    Categoria.listarCategoria();
                    break;

                case 4:
                    System.out.println("Agregar Cliente");
                    System.out.print("Introduce el codigo del cliente: ");
                    int cod_cli_res = scanner.nextInt();
                    System.out.print("Introcue el nombre: ");
                    String nom_res = scanner.nextLine();
                    System.out.print("Introcue la direccion: ");
                    String Adreca_res = scanner.nextLine();
                    System.out.print("Introduce el codigo postal: ");
                    int cp_res = scanner.nextInt();
                    System.out.print("Introduce la poblacion: ");
                    int cod_pob_res = scanner.nextInt();
                    Client.anadirClientes(cod_cli_res, nom_res, Adreca_res, cp_res, cod_pob_res);
                    break;

                case 5:
                    System.out.println("Agregar Articulo");
                    System.out.print("Introduce el codigo del articulo:  ");
                    int cod_a_res = scanner.nextInt();
                    System.out.print("Agrega una descripcion: ");
                    String descripcion_res = scanner.nextLine();
                    System.out.print("Introduce el precio: ");
                    double preu_res = scanner.nextDouble();
                    System.out.print("Introduce el stock: ");
                    int stock_res = scanner.nextInt();
                    System.out.print("Introduce el Stock minimo: ");
                    int stock_min_res = scanner.nextInt();
                    database.ejercicio2.Article.anadirArticulo(cod_a_res, descripcion_res, preu_res, stock_res, stock_min_res);
                    break;

                case 6:
                    System.out.println("Eliminando Articulo");
                    System.out.print("Introduce el codigo del cliente: ");
                    int cod_a_delete = scanner.nextInt();
                    database.ejercicio2.Article.eliminarArticulo(cod_a_delete);
                    break;

                case 7:
                    System.out.println("Modificar Articulo");
                    System.out.print("Introduce el prcio a cabiar en porcentaje");
                    double precio_res = scanner.nextDouble();
                    Article.modificarArticulo(precio_res);
                    break;

                case 8:
                    System.out.println("Añadir Poblacio");
                    System.out.print("Introduce el codigo de poblcion: ");
                    int cod_pob_res2 = scanner.nextInt();
                    System.out.print("Agrega un nombre: ");
                    String nom_res2 = scanner.nextLine();
                    System.out.print("Introduce la direccion: ");
                    String cod_pro2 = scanner.nextLine();
                    System.out.println();
                    Poble.anadirPueblo(cod_pob_res2, nom_res2,cod_pro2);
                    break;

                case 9:
                    System.out.println("Gracias por usar nuestro gestor de base de datos. Que tenga un buen dia.");
                    salir = 9;
                    break;
            }

        }
    }
}
