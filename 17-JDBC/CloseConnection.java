import java.sql.Connection;
import java.sql.DriverManager;

public class CloseConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try (
            Connection connection =
                    DriverManager.getConnection(
                            url, username, password)
        ) {

            System.out.println(
                    "Connection established."
            );

        } catch (Exception e) {

            e.printStackTrace();

        }

        System.out.println(
                "Connection closed automatically."
        );

    }

}
