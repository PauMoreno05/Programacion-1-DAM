//package database.ejercicio2;
//
//import java.sql.*;
//
//public class Field6Factura {
//    private int num_f;
//    private int cod_cli;
//    private String cod_ven;
//    private double iva;
//    private double dte;
//
//    public void anadirFactura(int num_f,String data,int cod_cli,int cod_ven,double iva,double dte){
//        PreparedStatement st = null;
//        Connection con = null;
//        String sql = "INSERT INTO article(num_f, cod_cli, cod_ven, iva, dte) VALUES (?, ?, ?, ?, ?)";
//
//        try {
//            con = DatabaseConnection.getConnection();
//            st = con.prepareStatement(sql);
//
//            st.setInt(1,num_f);
//            st.setInt(2,cod_cli);
//            st.setInt(3,cod_ven);
//            st.setDouble(4,iva);
//            st.setDouble(5,dte);
//            st.executeUpdate();
//
//        }catch (SQLException ex){
//            System.out.println("Error "+ ex.getMessage());
//
//        }finally {
//
//            try {
//                if (st != null && !st.isClosed()){
//                    st.close();
//                }
//
//            }catch (SQLException ex) {
//                System.out.println(" Error al cerrar el Statement");
//            }
//
//            try {
//                if (con != null && !con.isClosed()){
//                    con.close();
//                }
//
//            }catch (SQLException ex) {
//                System.out.println(" Error al cerrar la conexion");
//            }
//
//        }
//    }
//}
