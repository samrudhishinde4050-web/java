class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Thread is running.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

public class CreateThreadByExtendingThread {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();
    }
}
