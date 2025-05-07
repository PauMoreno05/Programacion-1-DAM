package gui.fin;

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
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getString(4) + "\t");
                System.out.print(rs.getInt(5 ) + "\t");
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

    public static void agregarLibro(String resISBN, String resTitulo, String resAutor, String resEditorial, int resAno, int resStock){
        String isbn = resISBN;
        String titulo = resTitulo;
        String autor = resAutor;
        String editorial = resEditorial;
        int anoPublicacion = resAno;
        int stock = resStock;

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


    public static void eliminarLibro(String resISBN){
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

    public static void actualizarLibro(String resISBN, String resTitulo) {

        Connection con = null;
        PreparedStatement st = null;

        String ISBN = resISBN;
        String Titulo = resTitulo;

        String sql = "UPDATE Libros SET Titulo = ? WHERE ISBN = ?;";

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

