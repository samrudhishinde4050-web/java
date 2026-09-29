import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementUpdate {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String query =
                "UPDATE students SET city = ? WHERE id = ?";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setString(1, "Mumbai");
            statement.setInt(2, 2);

            int rows = statement.executeUpdate();

            System.out.println(rows + " student updated successfully!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
