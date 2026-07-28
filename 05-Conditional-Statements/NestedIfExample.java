public class NestedIfExample {

    public static void main(String[] args) {

        int age = 32;
        boolean licence = true;

        if(age >= 18){

            if(licence){
                System.out.println("Eligible to Drive");
            }else{
                System.out.println("Apply for Licence");
            }

        }else{
            System.out.println("Not Eligible");
        }

    }
}
