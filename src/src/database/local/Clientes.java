package database.local;

import java.sql.*;
import java.util.Scanner;

public class Clientes {
    private static final String URL = "jdbc:sqlite:Libreria.db";

    public static void crearClientes(){
        Statement st = null;
        Connection con = null;
        String sql = "CREATE TABLE Clientes (DNI TEXT, Nombre TEXT, Apellidos TEXT, CP INTEGER, Edad INTEGER, LibrosComprados INTEGER, PRIMARY KEY(DNI));";
        try {
            con = DriverManager.getConnection(URL);
            st = con.prepareStatement(sql);

        }catch (SQLException ex){
            System.out.println("Error "+ ex.getMessage());

        }finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }

            }catch (SQLException ex) {
                System.out.println("Error al cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }

            }catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion");
            }
        }
    }
    public static void agregarCliente(Scanner scanner){
        System.out.print("Ingrese DNI: ");
        String dni = scanner.next();
        scanner.nextLine();

        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese editorial: ");
        int cp = scanner.nextInt();

        System.out.print("Ingrese Edad del cliente: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el numero de libros comprados por el cliente: ");
        int compras = scanner.nextInt();

        String sql = "INSERT INTO Libros (ISBN, Titulo, Autor, Editorial, AñoPublicacion, Stock) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, dni);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setInt(4, cp);
            pstmt.setInt(5, edad);
            pstmt.setInt(6, compras);
            pstmt.executeUpdate();
            System.out.println("Libro agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el Cliente: " + e.getMessage());
        }
    }
}
