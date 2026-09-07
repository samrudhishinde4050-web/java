interface Message {
    void show(String name);
}

public class LambdaWithParameters {
    public static void main(String[] args) {

        Message message = (name) -> {
            System.out.println("Hello " + name);
        };

        message.show("Samrudhi");
    }
}
