import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();

                    AddStudent.addStudent(
                            id, name, age, city
                    );

                    break;

                case 2:

                    ViewStudents.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = scanner.nextInt();

                    SearchStudent.searchStudent(searchId);

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int updateId = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter New City: ");
                    String newCity = scanner.nextLine();

                    UpdateStudent.updateStudent(
                            updateId,
                            newName,
                            newAge,
                            newCity
                    );

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");
                    int deleteId = scanner.nextInt();

                    DeleteStudent.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println(
                            "Thank you for using the system!"
                    );

                    scanner.close();
                    return;

                default:

                    System.out.println(
                            "Invalid choice!"
                    );
            }
        }
    }
}
