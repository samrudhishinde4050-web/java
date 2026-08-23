import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String sql = "SELECT * FROM students";

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password);

            Statement statement =
                    connection.createStatement();

            ResultSet result =
                    statement.executeQuery(sql)
        ) {

            while (result.next()) {

                System.out.println(
                        "ID: " + result.getInt("id")
                );

                System.out.println(
                        "Name: " + result.getString("name")
                );

                System.out.println(
                        "Age: " + result.getInt("age")
                );

                System.out.println(
                        "City: " + result.getString("city")
                );

                System.out.println("----------------");

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
