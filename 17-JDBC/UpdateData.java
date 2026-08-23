import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String sql =
                "UPDATE students SET city = ? WHERE id = ?";

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(sql)
        ) {

            statement.setString(1, "Pune");
            statement.setInt(2, 1);

            int rows = statement.executeUpdate();

            System.out.println(
                    rows + " record updated successfully."
            );

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
