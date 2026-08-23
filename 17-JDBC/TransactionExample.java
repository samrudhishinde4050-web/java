import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String sql =
                "INSERT INTO students(name, age, city) VALUES (?, ?, ?)";

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(sql)
        ) {

            connection.setAutoCommit(false);

            statement.setString(1, "Rutuja");
            statement.setInt(2, 21);
            statement.setString(3, "Sangli");

            statement.executeUpdate();

            connection.commit();

            System.out.println(
                    "Transaction completed successfully."
            );

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
