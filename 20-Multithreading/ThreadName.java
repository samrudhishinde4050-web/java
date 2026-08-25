public class ThreadName {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        System.out.println(
                "Default Name: " + thread.getName()
        );

        thread.setName("MainThread");

        System.out.println(
                "New Name: " + thread.getName()
        );
    }
}
