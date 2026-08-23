import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentDatabase {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "root";

        String sql = "CREATE DATABASE IF NOT EXISTS studentdb";

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password);

            Statement statement =
                    connection.createStatement()
        ) {

            statement.executeUpdate(sql);

            System.out.println(
                    "Student database created successfully."
            );

        } catch (SQLException e) {

            System.out.println(
                    "Database creation failed."
            );

            e.printStackTrace();
        }
    }
}
