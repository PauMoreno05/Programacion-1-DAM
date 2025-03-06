package database.ejercicio2;

import database.ejerciciodos.DatabaseConnection;

import java.sql.*;

public class Client {
    private int cod_cli;
    private String nom;
    private String adreca;
    private int cp;
    private int cod_pob;

    private Client(int cod_cli, String nom, String adreca, int cp){
        this.cod_cli=cod_cli;
        this.adreca=adreca;
        this.nom=nom;
        this.cp=cp;
    }

    public static void listarClientes(){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM client");

            System.out.println("cod_cli \tnom \tadreca \tcp \tcod_pob");
            System.out.println("======================================");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.println(rs.getInt(5));
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

    public static void anadirClientes(int cod_cli, String nom, String adreca, int cp, int cod_pob){
        PreparedStatement st = null;
        Connection con = null;
        String sql = "INSERT INTO client(cod_cli, nom, adreca, cp, cod_pob) VALUES (?, ?, ?, ?, ?)";

        try {
            con = DatabaseConnection.getConnection();
            st = con.prepareStatement(sql);

            st.setInt(1,cod_cli);
            st.setString(2,nom);
            st.setString(3,adreca);
            st.setInt(4,cp);
            st.setInt(5,cod_pob);
            st.executeUpdate();

        }catch (SQLException ex){
            System.out.println("Error "+ ex.getMessage());

        }finally {
            try {
                if (st != null && !st.isClosed()){
                    st.close();
                }

            }catch (SQLException ex) {
                System.out.println("Error al cerrar le Statement");
            }

            try {
                if (con != null && !con.isClosed()){
                    con.close();
                }

            }catch (SQLException ex) {
                System.out.println("Errir al cerrar la conexion");
            }
        }
    }
}

