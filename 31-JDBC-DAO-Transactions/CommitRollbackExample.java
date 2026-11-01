import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommitRollbackExample {

    public static void main(String[] args) {

        String sql =
                "INSERT INTO students (id, name, age, city) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false);

            try (PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, 401);
                ps.setString(2, "TestStudent");
                ps.setInt(3, 20);
                ps.setString(4, "Pune");

                ps.executeUpdate();

                // Undo the insert instead of saving it.
                con.rollback();

                System.out.println("Changes rolled back.");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
