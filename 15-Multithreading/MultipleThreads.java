class FirstThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("First Thread: " + i);

        }

    }

}

class SecondThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Second Thread: " + i);

        }

    }

}

public class MultipleThreads {

    public static void main(String[] args) {

        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();
        t2.start();

    }

}
