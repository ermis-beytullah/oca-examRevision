package Test8;

public class ScopeTest {

    public static void main(String[] args) {

        try {
            int i = 0;
//            i = Integer.parseInt( args[0]);
        }
        catch (NumberFormatException e) {
//            System.out.println("Problem in " + i);        // This line will not compile because variable i is defined in the try block and it cannot be accessed from the catch block. It is not in scope here.
        }
    }
}
