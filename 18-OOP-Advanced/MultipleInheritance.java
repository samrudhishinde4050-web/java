interface Printable {

    void print();
}

interface Showable {

    void show();
}

class Demo implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Print method");
    }

    @Override
    public void show() {
        System.out.println("Show method");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Demo demo = new Demo();

        demo.print();
        demo.show();
    }
}
