import java.io.File;

public class FileInformation {

    public static void main(String[] args) {

        File file = new File("sample.txt");

        System.out.println("File Name: " + file.getName());

        System.out.println("Exists: " + file.exists());

        System.out.println("Path: " + file.getAbsolutePath());

        System.out.println("Readable: " + file.canRead());

        System.out.println("Writable: " + file.canWrite());

        System.out.println("Size: " + file.length() + " bytes");

    }

}
