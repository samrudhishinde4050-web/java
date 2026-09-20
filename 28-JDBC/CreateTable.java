import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String query = """
                CREATE TABLE students (
                    id INT PRIMARY KEY,
                    name VARCHAR(50),
                    age INT,
                    city VARCHAR(50)
                )
                """;

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            statement.executeUpdate(query);

            System.out.println("Table created successfully!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
