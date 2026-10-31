import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchInsert {

    public static void main(String[] args) {

        String sql =
                "INSERT INTO students (id, name, age, city) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, 301);
            ps.setString(2, "Rutuja");
            ps.setInt(3, 21);
            ps.setString(4, "Pune");
            ps.addBatch();

            ps.setInt(1, 302);
            ps.setString(2, "Vaishnavi");
            ps.setInt(3, 22);
            ps.setString(4, "Kolhapur");
            ps.addBatch();

            int[] results = ps.executeBatch();

            System.out.println(
                    results.length + " batch operations executed."
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
