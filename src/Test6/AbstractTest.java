package Test6;

public abstract class AbstractTest {

    public abstract void m1();

//    public abstract void m2() {               // A method that has a body cannot be abstract. An abstract method cannot have a body.
//        System.out.println("hello");
//    }
}

// We either need to remove the body {} from method m2(), or remove the abstract key word from the method signature.