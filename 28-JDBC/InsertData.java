import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        String query =
                "INSERT INTO students VALUES " +
                "(1, 'Samrudhi', 22, 'Kolhapur')";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            statement.executeUpdate(query);

            System.out.println("Data inserted successfully!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
