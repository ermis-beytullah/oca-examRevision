package Test6;

public class TestClass {

    public static void main(String[] args) {

        TestClass t1, t2, t3, t4;   // t1, t2, t3, t4 means 4 references. A declared reference variable exists regardless of whether a reference value( i.e. an object) has been assigned to it or not.

        t1 = t2 = new TestClass();  // two 'new's means two objects.
        t3 = new TestClass();
    }
}

// In the above code there are 2 objects and 4 reference variables.