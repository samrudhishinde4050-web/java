import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchStudent {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String query =
                "SELECT * FROM students WHERE id = ?";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setInt(1, 1);

            ResultSet resultSet =
                    statement.executeQuery();

            if (resultSet.next()) {

                System.out.println("Student Found");
                System.out.println("ID: "
                        + resultSet.getInt("id"));

                System.out.println("Name: "
                        + resultSet.getString("name"));

                System.out.println("Age: "
                        + resultSet.getInt("age"));

                System.out.println("City: "
                        + resultSet.getString("city"));

            } else {
                System.out.println("Student not found");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
