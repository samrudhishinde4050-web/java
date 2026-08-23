import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String sql =
                "SELECT * FROM students WHERE age > ?";

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(sql)
        ) {

            statement.setInt(1, 18);

            var result = statement.executeQuery();

            while (result.next()) {

                System.out.println(
                        result.getString("name")
                );

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
