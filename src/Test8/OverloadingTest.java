package Test8;

public class OverloadingTest {

    void probe(Object x) {                          // (Boolean and Character) objects do not extend Number, so they are passed to the object that takes an Object.
        System.out.println("In Object");
    }

    void probe(Number x) {
        System.out.println("In Number");            // (Byte, Short, Integer, Long, Float, Double all extend Number) so all these objects can be passed to the method that takes a Number.
    }

    void probe(Integer x) {
        System.out.println("In Integer");
    }

    void probe(Long x) {
        System.out.println("In Long");
    }

    public static void main(String[] args) {

        double a = 10;

        new OverloadingTest().probe(a);
    }
}
