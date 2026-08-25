class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println(
                getName() + " Priority: " + getPriority()
        );
    }
}

public class ThreadPriority {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
