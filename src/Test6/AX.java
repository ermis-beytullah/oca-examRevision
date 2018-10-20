package Test6;

public class AX {

    static int[] x = new int[0];
    static {
//        x[0] = 10;                        // This line will normally throw java.lang.ArrayIndexOutOfBoundsException.
    }                                       // Instead any Exception thrown in a static block is wrapped into ExceptionInInitializerError and then it is thrown.

    public static void main(String[] args) {
        AX ax = new AX();
    }
}

// A static or instance initializer can only throw a RuntimeException.
// If we try to throw a checked Exception from a static or instance initializer block to the outside, the code will not compile.