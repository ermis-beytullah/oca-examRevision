package Test6;

import Test6.ProtectedTest.MyClass;

public class X extends MyClass {

    public static void main(String[] args) {

//        int a = new MyClass().value;          // This will not compile because X does not own MyClass's value.

        int a = new X().value;                  // This will compile fine because X inherits value.

        System.out.println(a);
    }
}
