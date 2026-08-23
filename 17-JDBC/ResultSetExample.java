import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultSetExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String sql = "SELECT id, name, age FROM students";

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password);

            PreparedStatement statement =
                    connection.prepareStatement(sql);

            ResultSet result =
                    statement.executeQuery()
        ) {

            while (result.next()) {

                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");

                System.out.println(
                        id + " " + name + " " + age
                );

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
