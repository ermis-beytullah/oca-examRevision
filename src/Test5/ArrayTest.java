package Test5;

public class ArrayTest {

    public static void main(String[] args) {

        A[] a, a1;
        B[] b;

        a = new A[10]; a1 = a;
        b = new B[20];

        a = b;
        b = (B[])a;                 // The cast at this line is needed because a superclass reference is assigned to a subclass variable.
//        b = (B[])a1;              // This line will throw a java.lang.ClassCastException.
    }
}

class A {}

class B extends A {}
