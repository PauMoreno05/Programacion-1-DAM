package database.ejerciciodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base de Datos Factura");

        boolean acabar = false;


        while (!acabar){
            System.out.println("Introduce una de las opciones (numeros) \n" +
                    "1. Listar Clientes \n" +
                    "2. Listar Facturas con Líneas \n" +
                    "3. Listar Articulos y Categorias \n" +
                    "4. Agregar Clientes \n" +
                    "5. Agregar Artículo \n" +
                    "6. Agregar Población \n" +
                    "7. Eliminar Artículo \n" +
                    "8. Modificar el precio de un artículo \n" +
                    "9. Salir");
            System.out.print("La opción es: ");
            int opcio = scanner.nextInt();
            switch (opcio){
                case 1:
                    Client.listar_clientes();
                    break;

                case 2:
                    LiniaFactura.listar_liniafactura();
                    break;

                case 3:
                    System.out.println("<-------Articulos-------> \n");
                    Article.listar_article();
                    System.out.println();
                    System.out.println("<--------Categoria--------> \n");
                    Categoria.listar_categoria();
                    break;

                case 4:
                    System.out.println("Introduce los datos del cliente");
                    System.out.print("Codigo: ");
                    int cod_cli2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Nombre: ");
                    String nom2 = scanner.nextLine();
                    System.out.println();
                    System.out.print("Adreca: ");
                    String Adreca2 = scanner.nextLine();
                    System.out.println();
                    System.out.print("Cp: ");
                    int cp2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Cod_pob: ");
                    int cod_pob2 = scanner.nextInt();

                    Client.agregar_client(cod_cli2,nom2,Adreca2,cp2,cod_pob2);
                    break;

                case 5:
                    System.out.println("Introduce los datos del articulo");
                    System.out.print("Cod_a: ");
                    int cod_a2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Desccripcio: ");
                    String descrip2 = scanner.nextLine();
                    System.out.println();
                    System.out.print("Preu: ");
                    double preu2 = scanner.nextDouble();
                    System.out.println();
                    System.out.print("Stock: ");
                    int stock2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Stock_min: ");
                    int stock_min2 = scanner.nextInt();

                    Article.agregar_article(cod_a2,descrip2,preu2,stock2,stock_min2);
                    break;

                case 6:
                    System.out.println("Borrador de articulos");
                    System.out.print("Introduce el codigo del cliente que desea eliminar: ");
                    int cod_aEliminar = scanner.nextInt();
                    Article.eliminar_article(cod_aEliminar);
                    break;

                case 7:
                    System.out.println("Modificar Articulo");
                    System.out.print("Introduce el porcentague que se le sumara o restara al precio actual(5% = 1.05 para sumar un 5%: ");
                    double preuModificat = scanner.nextDouble();
                    Article.modificar_article(preuModificat);
                    break;

                case 8:
                    System.out.println("Agregar una Poblacio");
                    System.out.print("Cod_pob: ");
                    int Cod_pob2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Nombre: ");
                    String nomP = scanner.nextLine();
                    System.out.println();
                    System.out.print("Adreca: ");
                    String Cod_pro2 = scanner.nextLine();
                    System.out.println();

                    Poble.agregar_poble(Cod_pob2,nomP,Cod_pro2);
                    break;

                case 9:
                    acabar = true;
                    break;
            }
        }


    }
}
