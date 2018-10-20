package Test7;

public class OverloadingTest {

    void probe(int... x) {
        System.out.println("In ...");
    }

    void probe(Integer x) {
        System.out.println("In Integer");
    }

    void probe(long x) {
        System.out.println("In long");
    }

    void probe(Long x) {
        System.out.println("In Long");              // Integer a is never bound to probe(Long) because Integer and Long are different object types and there is not IS-A relationship between them.
    }                                               // This is true for any wrapper classes. It could however be bound to probe(Object) if it existed because Integer IS-A Object.

    public static void main(String[] args) {

        Integer a = 4;
        new OverloadingTest().probe(a);

        int b = 4;
        new OverloadingTest().probe(b);
    }
}

// 1. The compiler always tries to choose the most specific method available with least number of modifications to the arguments.
// 2. Java designers have decided that old code should work as it used to work before boxing-unboxing functionality became available.
// 3. Widening is preferred to boxing-unboxing because of line 2. In turn it is preferred over var-args.

