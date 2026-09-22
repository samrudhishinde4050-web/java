import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String query = "SELECT * FROM students";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet =
                    statement.executeQuery(query);

            while (resultSet.next()) {

                System.out.println(
                        resultSet.getInt("id") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getInt("age") + " " +
                        resultSet.getString("city")
                );
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
