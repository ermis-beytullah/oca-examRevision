package Test5;

class MyException extends Exception {}

public class ExceptionTest {

    public static void main(String[] args) //throws MyException {
    {

        ExceptionTest et = new ExceptionTest();

        try {
            et.m1();
        }

        catch(MyException e) {
//            et.m1();                          // When the catch block is throwing a checked Exception then it must be handled either by a try-catch block or declared in the throws clause of the enclosing method(The main method).
        }

        finally {
            et.m2();                            // This line will not cause problems because we are not required to handle un-checked-Exceptions.
        }
    }

    public void m1() throws MyException {

        throw new MyException();
    }

    public void m2() throws RuntimeException {

        throw new RuntimeException();
    }
}
