package Test4;

class A {

    final int fi = 10;                      // The final variable fi here is hidden in the A class.
}
public class B extends A{

    int fi = 15;                            // If this variable fi was declared final then the code on 14 would not compile.

    public static void main(String[] args) {

        B b = new B();
        b.fi = 20;
        System.out.println(b.fi);
        System.out.println(((A)b).fi);
    }
}
