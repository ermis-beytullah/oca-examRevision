package Test2;

public class StaticTest {

    void m1() {

        StaticTest.m2();
        m4();
//        StaticTest.m3();      // Trying to call an instance method from another instance method, we need to specify an object reference or we can rely on this. if we want to omit it. However we cannot do StaticTest.m3() because StaticTest is not a valid reference that points to an object of class StaticTest.
    }

    static void m2() {

    }

    void m3() {
        m1();
        m2();                   // We can call a static method of a class from either a static or an instance method of the same class. No object is required. To call a static method of another class, you must use the name of the other class. e.g OtherClass.staticMethod().
//        StaticTest.m1();
    }

    static void m4() {

    }
}
