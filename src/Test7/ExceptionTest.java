package Test7;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            RuntimeException re = null;
            throw re;                       // The try block generates NullPointerException which will be caught by the catch block.
        }
        catch (Exception e) {
            System.out.println(e);          // A NullPointerException will be thrown if the expression given to the throw statement results in a null pointer.
        }
    }
}

