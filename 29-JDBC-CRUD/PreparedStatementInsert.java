import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementInsert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String query =
                "INSERT INTO students (id, name, age, city) VALUES (?, ?, ?, ?)";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setInt(1, 2);
            statement.setString(2, "Rutuja");
            statement.setInt(3, 21);
            statement.setString(4, "Pune");

            int rows = statement.executeUpdate();

            System.out.println(rows + " student inserted successfully!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
