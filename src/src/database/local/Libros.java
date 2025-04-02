package database.local;

import java.sql.*;
import java.util.Scanner;

public class Libros {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int anoPubicacion;
    private int stock;

    public Libros(String isbn, String titulo, String autor, String editorial, int anoPubicacion, int stock){
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.anoPubicacion = anoPubicacion;
        this.stock = stock;
    }

    private static final String URL = "jdbc:sqlite:Libreria.db";

    public static void listarLibros(){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(URL);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM Libros");

            System.out.println("ISBN \tTitulo \tAutor \tEditorial \tAño de publicacion \tStock");
            System.out.println("==============================================================");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.println(rs.getInt(5 ) + "\t");
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

    public static void agregarLibro(Scanner scanner){
        System.out.print("Ingrese ISBN: ");
        String isbn = scanner.next();
        scanner.nextLine();

        System.out.print("Ingrese título: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese editorial: ");
        String editorial = scanner.nextLine();

        System.out.print("Ingrese año de publicación: ");
        int anoPublicacion = scanner.nextInt();

        System.out.print("Ingrese stock: ");
        int stock = scanner.nextInt();

        String sql = "INSERT INTO Libros (ISBN, Titulo, Autor, Editorial, AñoPublicacion, Stock) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, isbn);
            pstmt.setString(2, titulo);
            pstmt.setString(3, autor);
            pstmt.setString(4, editorial);
            pstmt.setInt(5, anoPublicacion);
            pstmt.setInt(6, stock);
            pstmt.executeUpdate();
            System.out.println("Libro agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el Libro: " + e.getMessage());
        }
    }


    public static void eliminarLibro(int resISBN ){
        PreparedStatement st = null;
        Connection con = null;
        String sql = "DELETE FROM Libros WHERE ISBN = " + resISBN;

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

    public static void crearLibros(){
        Statement st = null;
        Connection con = null;
        String sql = "CREATE TABLE IF NOT EXISTS Libros (ISBN TEXT, Titulo TEXT, Autor TEXT, Editorial TEXT, AñoPublicacion INTEGER, Stock INTEGER, PRIMARY KEY(ISBN))";
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

    public static void actualizarLibro() {

        Connection con = null;
        PreparedStatement st = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el ISBN del libro a cambiar el titulo: ");
        String ISBN = scanner.nextLine();
        System.out.print("Escribe el nuevo Titulo: ");
        String Titulo = scanner.nextLine();

        String sql = "UPDATE Libros SET Titulo = ? WHERE ISBN = ?";

        try {
            con = DriverManager.getConnection(sql);
            st = con.prepareStatement(sql);

            st.setString(1, Titulo);
            st.setString(2, ISBN);
            int filasActualizadas = st.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Libro actualizado.");
            } else {
                System.out.println("No se encontro ISBN.");
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

