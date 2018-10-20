package Test6;

public class DefaultInitialisation {

    int [] ia = new int[1];                 // Types(byte, short, int, long, float, double) initialised to 0(or 0.0).
    Object oA [] = new Object[1];           // All Object types to null.
    boolean bool;                           // boolean to false.

    public static void main(String[] args) {

        DefaultInitialisation di = new DefaultInitialisation();
        System.out.println(di.ia[0] + " " + di.oA[0] + " " + di.bool);
    }
}
