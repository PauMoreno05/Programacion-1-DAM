package gui.fin;

import java.sql.*;
import java.util.Scanner;

public class Clientes {
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private int CP;
    private int Edad;
    private int LIbrosComprado;

    public Clientes(String DNI, String Nombre, String Apellidos, int CP, int Edad, int LIbrosComprado){
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.CP = CP;
        this.Edad = Edad;
        this.LIbrosComprado = LIbrosComprado;
    }

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
    public static void eliminarCliente(String resCli){
        PreparedStatement st = null;
        Connection con = null;
        String sql = "DELETE FROM Clientes WHERE DNI = " + resCli;

        try {
            con = DriverManager.getConnection(URL);
            st = con.prepareStatement(sql);
            st.executeUpdate();

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
    public static void actualizarCliente() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el DNI el cliente para cambierle la edad: ");
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
