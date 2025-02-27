package database.ejercico1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifyData {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        String sql;

        try {
            con = DatabaseConnection.getConnection();
            st = con.createStatement();

            sql = "UPDATE EMPLEADOS SET sueldo = sueldo * 1.05";
            st.executeUpdate(sql);

            sql = "UPDATE EMPLEADOS SET departamento = 20 WHERE num = 3";
            st.executeUpdate(sql);
        }catch (SQLException ex){
            System.out.println("Error " + ex.getMessage());
        }finally {
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
                System.out.println("No se ha podido cerrar la conexion.");
            }
        }
    }
}
