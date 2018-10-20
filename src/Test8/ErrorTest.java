package Test8;

public class ErrorTest {


    public static void methodX() throws Exception {

        throw new AssertionError();
    }

    public static void main(String [] args) {

        try {
            methodX();                          // A subclass of Error cannot be caught using a catch block for Exceptions because java.lang.Error does not extend java.lang.Exception.
        }
                                                // It will throw AssertionError out of the main() method.
        catch(Exception e) {
            System.out.println("EXCEPTION");
        }
    }
}
