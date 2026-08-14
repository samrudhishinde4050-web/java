class Task extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Task: " + i);

        }

    }

}

public class JoinExample {

    public static void main(String[] args)
            throws InterruptedException {

        Task thread = new Task();

        thread.start();

        thread.join();

        System.out.println("Main thread continues.");

    }

}
