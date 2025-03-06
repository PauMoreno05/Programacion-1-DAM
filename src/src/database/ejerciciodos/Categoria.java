package database.ejerciciodos;

//import BasesDeDatos.DatabaseConnection;

import java.sql.*;

public class Categoria {
    private int cod_cat;
    private String descripcio;

    public Categoria(int cod_cat,String descripcio){
        this.cod_cat=cod_cat;
        this.descripcio=descripcio;
    }

    public void agregar_categoria(int cod_cat,String descripcio){
        PreparedStatement st = null;
        Connection con = null;

        String sql = "INSERT INTO article(cod_cat, descripcio) VALUES (?, ?)";

        try {
            con = DatabaseConnection.getConnection();
            st = con.prepareStatement(sql);

            st.setInt(1,cod_cat);
            st.setString(2,descripcio);
            st.executeUpdate();

        }catch (SQLException ex){
            System.out.println("Error "+ ex.getMessage());
        }finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }
            }catch (SQLException ex) {
                System.out.println(" No se ha podido cerrar el Statement por alguna razón");
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }
            }catch (SQLException ex) {
                System.out.println(" No se ha podido cerrar la conexion por alguna razón");
            }
        }

    }

    public static void listar_categoria(){

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM categoria");

            System.out.println("cod_cat \tdescripcio");
            System.out.println("--------------------------------------------");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.println(rs.getInt(2));
            }
        }catch (SQLException e){
            System.out.println("Se ha producido un error al leer los empleados. Mensaje: " + e.getMessage());
        }finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }
            }catch (SQLException ex) {
                System.out.println("Se ha producido un error al cerrar el Statement " + ex.getMessage());
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }
            }catch (SQLException ex) {
                System.out.println(" No se ha producido un error al cerrar la conexión." + ex.getMessage());
            }

            try {
                if (rs != null && !rs.isClosed()){
                    rs.close();
                }
            }catch (SQLException ex) {
                System.out.println("Se ha producido un error al cerrar el ResultSet " + ex.getMessage());
            }
        }
    }
}
