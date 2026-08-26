import java.io.File;

public class FileInformation {

    public static void main(String[] args) {

        File file = new File("student.txt");

        System.out.println(
                "File Name: " + file.getName()
        );

        System.out.println(
                "Absolute Path: " + file.getAbsolutePath()
        );

        System.out.println(
                "File Exists: " + file.exists()
        );

        System.out.println(
                "File Size: " + file.length() + " bytes"
        );

        System.out.println(
                "Readable: " + file.canRead()
        );

        System.out.println(
                "Writable: " + file.canWrite()
        );
    }
}
