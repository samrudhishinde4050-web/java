class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Child Thread: " + i);
        }
    }
}

public class ThreadJoin {

    public static void main(String[] args)
            throws InterruptedException {

        MyThread thread = new MyThread();

        thread.start();

        thread.join();

        System.out.println("Main thread completed.");
    }
}
