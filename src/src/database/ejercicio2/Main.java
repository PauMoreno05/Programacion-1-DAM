package database.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resMenu = 0;

        while (true){
            System.out.println("=================================================");
            System.out.println("Bienvenido al gestor de Base de datos IES CAMINAS");
            System.out.println("=================================================");
            System.out.println("1. Lsitar clientes");
            System.out.println("2. Listar Facturas con Lineas");
            System.out.println("3. Listar Articulos y Categorias");
            System.out.println("4. Agregar Cliente");
            System.out.println("5. Agregar Articulo");
            System.out.println("6. Eliminar Articulo");
            System.out.println("7. Modificar Precio de Articulo");
            System.out.println("8. Agregerar Poblacion");
            System.out.println("9. SALIR");
            System.out.println("Elige una opcion para continuar: ");
            resMenu = scanner.nextInt();

            if (resMenu >= 1 && resMenu <= 8){

            }else if(resMenu > 9) {
                System.out.println("Opcion incorrecta, elija otra opcion valida");
            } else if (resMenu == 9) {
                System.out.println("Gracias por usar este gestor de Base da Datos, que tenga un buen dia.");
                break;
            }
        }

    }
}
