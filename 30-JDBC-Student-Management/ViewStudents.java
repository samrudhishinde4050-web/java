import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewStudents {

    public static void viewStudents() {

        String query = "SELECT * FROM students";

        try {
            Connection connection =
                    DatabaseConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(query);

            ResultSet resultSet =
                    statement.executeQuery();

            while (resultSet.next()) {

                System.out.println(
                        "ID: " + resultSet.getInt("id")
                );

                System.out.println(
                        "Name: " + resultSet.getString("name")
                );

                System.out.println(
                        "Age: " + resultSet.getInt("age")
                );

                System.out.println(
                        "City: " + resultSet.getString("city")
                );

                System.out.println("-------------------");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
