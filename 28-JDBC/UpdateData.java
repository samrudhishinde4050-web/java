import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String query =
                "UPDATE students SET city = 'Pune' WHERE id = 1";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate(query);

            System.out.println(rows + " record updated successfully!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
