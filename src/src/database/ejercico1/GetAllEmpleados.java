package database.ejercico1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetAllEmpleados {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DatabaseConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM empleados2");
            System.out.println("Num. \tNombre \tDep \tEdad \tSueldo");
            System.out.println("-----------------------------------------");

            while (rs.next()){
                System.out.print(rs.getInt(1)+"\t    ");
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getInt(3)+"\t    ");
                System.out.print(rs.getInt(4)+"\t    ");
                System.out.println(rs.getDouble(5)+"\t");
            }
        }catch (SQLException ex){
            System.out.println("Se ha producido un error al conectarse a los empleados ( " + ex.getMessage() + " )");
        }finally {
            try {
                if (st != null){
                    st.close();
                }
            }catch (SQLException ex){
                System.out.println("Se ha producido un error al cerrar el Statement");
            }
            try {
                if (rs != null){
                    rs.close();
                }
            }catch (SQLException ex){
                System.out.println("se ha producido un error al cerar el ResultSet");
            }
            try {
                if (con != null){
                    con.close();
                }
            }catch (SQLException ex){
                System.out.println("se ha producido un error al cerar la conexion");
            }
        }
    }
}
