package Test6;

public class SwitchStatementTest {

    public static void main(String[] args) {

        int x = Integer.parseInt("5");
        switch(x) {

//            case x < 5:                               // The type of the case labels must be consistent with the type of the switch statement condition.
//                System.out.println("BIG");            // Here, switch condition is an int, so the case label must be assignable to the switch condition variable.
//                break;                                // The expression x < 5 is of type boolean, which cannot be assigned to x(since x is an int).
//
//            case x > 5:
//                System.out.println("SMALL");

                default:
                    System.out.println("CORRECT");
                    break;
        }
    }
}
