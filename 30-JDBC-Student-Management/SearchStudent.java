import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchStudent {

    public static void searchStudent(int id) {

        String query =
                "SELECT * FROM students WHERE id = ?";

        try {
            Connection connection =
                    DatabaseConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setInt(1, id);

            ResultSet resultSet =
                    statement.executeQuery();

            if (resultSet.next()) {

                System.out.println(
                        "ID: " + resultSet.getInt("id")
                );

                System.out.println(
                        "Name: " +
                        resultSet.getString("name")
                );

                System.out.println(
                        "Age: " +
                        resultSet.getInt("age")
                );

                System.out.println(
                        "City: " +
                        resultSet.getString("city")
                );

            } else {

                System.out.println(
                        "Student not found!"
                );
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
