import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

    public static void main(String[] args) {

        String sql =
                "INSERT INTO students (id, name, age, city) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false);

            try (PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, 201);
                ps.setString(2, "Aditi");
                ps.setInt(3, 21);
                ps.setString(4, "Pune");
                ps.executeUpdate();

                ps.setInt(1, 202);
                ps.setString(2, "Priya");
                ps.setInt(3, 22);
                ps.setString(4, "Mumbai");
                ps.executeUpdate();

                con.commit();
                System.out.println("Transaction committed!");

            } catch (SQLException e) {
                con.rollback();
                System.out.println("Transaction rolled back!");
                throw e;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
