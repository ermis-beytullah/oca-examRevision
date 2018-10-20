package Test4;

public class IsATest {

    public static void main(String[] args) {

        IsATest isATest = new IsATest();
        IsA isA = new IsA();

        isATest = isA;
//        isA = isATest;        // this requires an explicit cast because class IsA is a subclass of IsATest.
        isATest = (IsA) isA;
        isA = (IsA)isATest;
    }
}

class IsA extends IsATest {}
