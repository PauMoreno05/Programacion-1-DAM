package database.ejerciciodos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://89.36.214.106:5432/f_1cfsy_4349f";
    private static final String USER = "f_1cfsy_4349f";
    private static final String PASSWORD = "f_1cfsy_4349f";

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
