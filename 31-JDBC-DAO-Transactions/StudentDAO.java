import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    public void addStudent(Student student)
            throws SQLException {

        String query =
                "INSERT INTO students (id, name, age, city) " +
                "VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(query)) {

            statement.setInt(1, student.getId());
            statement.setString(2, student.getName());
            statement.setInt(3, student.getAge());
            statement.setString(4, student.getCity());

            int rows = statement.executeUpdate();

            System.out.println(rows + " student inserted.");
        }
    }

    public void viewStudents() throws SQLException {

        String query = "SELECT * FROM students";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id") + " | " +
                        resultSet.getString("name") + " | " +
                        resultSet.getInt("age") + " | " +
                        resultSet.getString("city")
                );
            }
        }
    }
}
