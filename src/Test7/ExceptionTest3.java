package Test7;

public class ExceptionTest3 {

    public static void main(String[] args) {

        try {
            m1();

        } catch (IndexOutOfBoundsException e) {                 // The IndexOutOfBoundsException is handled in the first catch block. Inside this block, a new NullPointerException is thrown.
            System.out.println("1");
//            throw new NullPointerException();                 // As this exception is not thrown in the try block, it will not be caught by any of the remaining catch blocks. 4
                                                                // It will actually be sent to the caller of the main() method and after the finally block is executed.
//
        } catch (NullPointerException e) {
            System.out.println("2");
            return;

        } catch (Exception e) {
            System.out.println("3");

        } finally {
            System.out.println("4");
        }

        System.out.println("END");                          // The code that print END will never be reached, since the NullPointerException remains uncaught after the execution of the finally block.
    }

    static void m1() {
        System.out.println("m1 Starts");
        throw new IndexOutOfBoundsException("Big Bang");
    }
}
