package gui.fin;


import java.sql.*;
import java.util.Scanner;

public class Compras {
    private String cod_com;
    private String DNI_cli;
    private String fechaCompra;
    private String Libro_id;

    public Compras(String cod_com, String DNI_cli, String fechaCompra, String Libro_id) {
        this.cod_com = cod_com;
        this.fechaCompra = fechaCompra;
        this.DNI_cli = DNI_cli;
        this.Libro_id = Libro_id;
    }

    private static final String URL = "jdbc:sqlite:Libreria.db";

    public static void crearCrompas() {
        Statement st = null;
        Connection con = null;
        String sql = "CREATE TABLE IF NOT EXISTS Compras (Cod_com TEXT, Libro_id TEXT, DNI_cli TEXT, FechaCompra TEXT, PRIMARY KEY(Cod_com), CONSTRAINT fk_Libro_id FOREIGN KEY (Libro_id) REFERENCES Libros (ISBN),CONSTRAINT fk_DNI_cli FOREIGN KEY (DNI_cli) REFERENCES Clientes (DNI));";
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
    public static void agregarCompra(Scanner scanner){
        System.out.print("Ingrese el codigo de la compra: ");
        String resCod = scanner.next();
        scanner.nextLine();

        System.out.print("Ingrese el DNI del cliente: ");
        String resDNI = scanner.nextLine();

        System.out.print("Ingrese la fecha de la compra: ");
        String fechCom = scanner.nextLine();

        System.out.print("Ingrese el ISBN del Libro: ");
        String ISBNres = scanner.nextLine();


        String sql = "INSERT INTO Compras (Cod_com, Libro_id, DNI_cli, FechaCompra) VALUES (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, resCod);
            pstmt.setString(2, resDNI);
            pstmt.setString(3, fechCom);
            pstmt.setString(4, ISBNres);
            pstmt.executeUpdate();
            System.out.println("Compra agregada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar la Compra: " + e.getMessage());
        }
    }
    public static void listarCompra(){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(URL);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM Compras");

            System.out.println("Codigo compra \tISBN de libro \tDNI cliente \tFecha de la comrpa ");
            System.out.println("=================================================");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getString(4));

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
    public static void eliminarCompra(String resCod){
        PreparedStatement st = null;
        Connection con = null;
        String sql = "DELETE FROM Compra WHERE Cod_com = " + resCod;

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
    public static void actualizarCompra() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el Codigo de la compra para cambierle la fecha: ");
        String cod_res2 = scanner.nextLine();
        System.out.print("Introduce la nueva fecha ");
        String fechRes = scanner.next();

        String sql = "UPDATE Compras SET Fecha = ? WHERE Cod_com = ?";

        try {
            con = DriverManager.getConnection(sql);
            st = con.prepareStatement(sql);

            st.setString(1, fechRes);
            st.setString(2, cod_res2);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Compra actualizada.");
            } else {
                System.out.println("No se encontro codigo de la compra.");
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

    public static void imprimirCompraPorID() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el Codigo de la compra: ");
        int reservaID = scanner.nextInt();

        String sql = "SELECT Compras.cod_com AS CodigoCompra, Compras.DNI_cli AS DNI_cliente, Compras.fechaCompra," +
                "Compras.Libro_id AS LibroComprado, Libros.titulo AS Titulo " +
                "FROM Compras " +
                "JOIN Clientes ON Compras.DNI_cli = Compras.DNI_cli " +
                "JOIN Libros ON Compras.Libro_id = Compras.Libro_id " +
                "WHERE Compras.cod_com = ?";

        try (Connection con = DriverManager.getConnection (URL);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, reservaID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("\n╔═══════════════════════════════════════════╗");
                System.out.println("║            DETALLE DE RESERVA             ║");
                System.out.println("╠═══════════════════════════════════════════╣");
                System.out.printf("║ %-15s: %-20s ║\n", "ID Compra", rs.getInt("CodigoCompra"));
                System.out.printf("║ %-15s: %-20s ║\n", "DNI Cliente", rs.getString("DNI_cliente"));
                System.out.printf("║ %-15s: %-20s ║\n", "Fecha de la compra", rs.getString("fechaCompra"));
                System.out.printf("║ %-15s: %-20s ║\n", "Libro ISBN", rs.getString("LibroComprado"));
                System.out.printf("║ %-15s: %-20s ║\n", "Titulo Libro", rs.getString("Titulo"));
                System.out.println("╚═══════════════════════════════════════════╝");
            } else {
                System.out.println("No se encontró una compra con ese Codigo.");
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la compra: " + e.getMessage());
        }
    }

}



