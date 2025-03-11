package database.ejercicio2;


import java.sql.*;

public class Poble {
    private int cod_pob;
    private String nom;
    private String cod_pro ;

    public Poble(int cod_pob,String nom, String cod_pro){
        this.cod_pob = cod_pob;
        this.nom = nom;
        this.cod_pro = cod_pro;
    }

    public static void anadirPueblo (int cod_pob, String nom, String cod_pro){
        PreparedStatement st = null;
        Connection con = null;
        String sql = "INSERT INTO article(cod_pob, nom, cod_pro) VALUES (?, ?, ?)";

        try {
            con = DatabaseConnection.getConnection();
            st = con.prepareStatement(sql);

            st.setInt(1,cod_pob);
            st.setString(2,nom);
            st.setString(3,cod_pro);
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
}