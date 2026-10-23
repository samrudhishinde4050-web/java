
import java.sql.SQLException;

public class StudentDAOExample {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        try {
            Student student =
                    new Student(101, "Samrudhi", 22, "Pune");

            dao.addStudent(student);

            System.out.println("Student records:");
            dao.viewStudents();

        } catch (SQLException e) {
            System.out.println("Database operation failed.");
            e.printStackTrace();
        }
    }
}
