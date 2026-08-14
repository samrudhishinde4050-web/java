class PriorityThread extends Thread {

    @Override
    public void run() {

        System.out.println(
                getName() + " Priority: " + getPriority());

    }

}

public class ThreadPriority {

    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setName("Low");
        t2.setName("Normal");
        t3.setName("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }

}
