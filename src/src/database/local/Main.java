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

        try{
            con = DriverManager.getConnection(url);
            System.out.println("Se ha establecido conexion con la base de datos en local");

            while (res != 5) {
                System.out.println("=================================");
                System.out.println("Guestor de base de datos en local");
                System.out.println("=================================");
                System.out.println("1. Mostrar todos los elementos almacenados en la tabla");
                System.out.println("2. Agregar un nuevo elemento a la tabla");
                System.out.println("3. Actualiza un campo de un elemento por su ID");
                System.out.println("4. Elimina un elemento por su ID");
                System.out.println("5. Salir");
                System.out.println("");
                System.out.println("Que desea hacer?: ");
                res = scanner.nextInt();
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());;
        } finally {
            try{
                if (con != null){
                    con.close();
                }
            }catch (Exception ex){
                System.out.println("Error al cerrar la conexion");
            }
        }
    }
}
