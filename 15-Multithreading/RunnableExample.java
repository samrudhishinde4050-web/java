class MyRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println("Runnable thread is running.");

    }

}

public class RunnableExample {

    public static void main(String[] args) {

        MyRunnable task = new MyRunnable();

        Thread thread = new Thread(task);

        thread.start();

    }

}
