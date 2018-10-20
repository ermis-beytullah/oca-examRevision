package Test4;

public class ArrayOfPrimitives {

    public static void main(String[] args) {

        int a = 1;
        int[] ia = new int[10];         // All elements of an array of primitives are automatically initialised by default values, which is 0 for numeric types and false for boolean.
        int b = ia[a];                  // Therefore ia[1] = 0.
        int c = b + a;
        b = c;

        System.out.println(b); // b = c is also allowed in the print statement
    }
}
