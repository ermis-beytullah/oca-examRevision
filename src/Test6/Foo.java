package Test6;

interface Bar {
    void bar();
}

abstract class FooBase {

    private static void bar() {                         // If the method bar() in FooBase was public then this code will not compile because it will cause a conflict in the Foo class.
        System.out.println("In static bar");            // A class cannot have two methods with the same signature in its scope where one is static and one is instance.
    }                                                   // Therefore, the Foo class cannot be a subclass of FooBase and implement Bar at the same time.
}
public class Foo extends FooBase implements Bar {

    @Override
    public void bar() {

    }
}
