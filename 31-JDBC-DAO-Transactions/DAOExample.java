import java.sql.SQLException;

public class DAOExample {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOImpl();

        try {
            Student student =
                    new Student(101, "Samrudhi", 22, "Kolhapur");

            dao.addStudent(student);

            for (Student s : dao.getAllStudents()) {
                System.out.println(
                        s.getId() + " | " +
                        s.getName() + " | " +
                        s.getAge() + " | " +
                        s.getCity()
                );
            }

        } catch (SQLException e) {
            System.out.println("Database operation failed.");
            e.printStackTrace();
        }
    }
}
