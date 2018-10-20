package Test7;

public class ATest {

    String global = "111";

    public int parse(String arg) {
        int value = 0;

        try {
            String global = arg;                                    // Here there is a new local variable names global that is defined in the try block. It is accessible only in the try block.
            value = Integer.parseInt(global);                       // It shadows the instance field of the same name global within the try block. It is this variable that is used in the parseInt call.
        }                                                           // Therefore, value is set to 333.
        catch(Exception e) {
            System.out.println(e.getClass());
        }

        System.out.println(global + " " + value + " ");             // However when we print global in the parse method, the global defined in the try block is out of scope and the instance field named global is used.
        return value;                                               // Therefore it prints 111.
    }

    public static void main(String[] args) {

        ATest at = new ATest();
        System.out.println(at.parse("333"));
    }
}
