package database.local;

import java.sql.*;
import java.util.Scanner;

public class Clientes {
    private static final String URL = "jdbc:sqlite:Libreria.db";

    public static void crearClientes(){
        Statement st = null;
        Connection con = null;
        String sql = "CREATE TABLE IF NOT EXISTS Clientes (DNI TEXT, Nombre TEXT, Apellidos TEXT, CP INTEGER, Edad INTEGER, LibrosComprados INTEGER, PRIMARY KEY(DNI));";
        try {
            con = DriverManager.getConnection(URL);
            st = con.createStatement();
            st.executeUpdate(sql);

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

        System.out.print("Ingrese Codigo postal: ");
        int cp = scanner.nextInt();

        System.out.print("Ingrese Edad del cliente: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el numero de libros comprados por el cliente: ");
        int compras = scanner.nextInt();

        String sql = "INSERT INTO Clientes (DNI, Nombre, Apellidos, CP, Edad, LibrosComprados) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, dni);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setInt(4, cp);
            pstmt.setInt(5, edad);
            pstmt.setInt(6, compras);
            pstmt.executeUpdate();
            System.out.println("Cliente agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el Cliente: " + e.getMessage());
        }
    }
    public static void listarClientes(){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(URL);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM Clientes");

            System.out.println("DNI \tNombre \tApellidos \tCP \tEdad \tLibros Comprados");
            System.out.println("==============================================================");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.println(rs.getInt(5 ));
                System.out.println(rs.getInt(6));
            }

        }catch (SQLException e){
            System.out.println("Error: " + e.getMessage());

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

}
