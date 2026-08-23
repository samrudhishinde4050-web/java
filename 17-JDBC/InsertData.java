import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

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

            statement.setString(1, "Samrudhi");
            statement.setInt(2, 21);
            statement.setString(3, "Kolhapur");

            int rows = statement.executeUpdate();

            System.out.println(
                    rows + " record inserted successfully."
            );

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
