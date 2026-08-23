import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String sql = """
                CREATE TABLE IF NOT EXISTS students (
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(100),
                    age INT,
                    city VARCHAR(100)
                )
                """;

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password);

            Statement statement =
                    connection.createStatement()
        ) {

            statement.executeUpdate(sql);

            System.out.println("Table created successfully.");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
