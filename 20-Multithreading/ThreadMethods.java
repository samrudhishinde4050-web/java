public class ThreadMethods {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        System.out.println(
                "Name: " + thread.getName()
        );

        System.out.println(
                "Priority: " + thread.getPriority()
        );

        System.out.println(
                "Alive: " + thread.isAlive()
        );

        System.out.println(
                "ID: " + thread.getId()
        );
    }
}
