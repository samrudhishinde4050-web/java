class StudentThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Student Thread: " + i);

        }

    }

}

public class ThreadClassExample {

    public static void main(String[] args) {

        StudentThread thread = new StudentThread();

        thread.start();

    }

}
