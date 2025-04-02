package database.local;

import java.sql.*;
import java.util.Scanner;

public class Locales {
    private static final String URL = "jdbc:sqlite:Libreria.db";

    public static void crearLocales(){
        Statement st = null;
        Connection con = null;
        String sql = "CREATE TABLE IF NOT EXISTS Locales (Cod_loc TEXT, Nombre TEXT, Direccion TEXT, CP INTEGER, PRIMARY KEY(Cod_loc));";
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
    public static void listarLocales(){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(URL);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM Locales");

            System.out.println("Cod_loc \tNombre \tDireccion \tCP");
            System.out.println("=================================");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4));
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
    public static void agregarLocales(Scanner scanner){
        System.out.print("Ingrese Codigo de local: ");
        String resCodCli = scanner.next();
        scanner.nextLine();

        System.out.print("Ingrese Nombre del local: ");
        String resNombreLoc = scanner.nextLine();

        System.out.print("Ingrese la direccions: ");
        String resDireccion = scanner.nextLine();

        System.out.print("Ingrese Codigo postal: ");
        int resCp = scanner.nextInt();

        String sql = "INSERT INTO Locales (Cod_cli, Nombre, Direccion, CP) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, resCodCli);
            pstmt.setString(2, resNombreLoc);
            pstmt.setString(3, resDireccion);
            pstmt.setInt(4, resCp);
            pstmt.executeUpdate();
            System.out.println("Local agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el Local: " + e.getMessage());
        }
    }
    public static void actualizarLocales() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el Codigo del local para cambierle su nombre: ");
        String resDNI = scanner.nextLine();
        System.out.print("Introduce la nueva edad ");
        int edad = scanner.nextInt();

        String sql = "UPDATE Clientes SET Edad = ? WHERE DNI = ?";

        try {
            con = DriverManager.getConnection(sql);
            st = con.prepareStatement(sql);

            st.setInt(1, edad);
            st.setString(2, resDNI);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Cliente actualizado.");
            } else {
                System.out.println("No se encontro DNI.");
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                if (st != null && !st.isClosed()) {
                    st.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar el Statement");
            }

            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cenrrar la conexion");
            }
        }
    }
}
