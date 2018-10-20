package Test5;

public class InterfaceTest implements T1, T2{

    public void m1() {}
}

interface T1 {

    int VALUE = 1;

    void m1();
}

interface T2 {

    int VALUE = 2;

    void m1();
}

// There is nothing wrong with the above code. Having ambiguous fields or methods doesn't cause any problems but referring to these fields/methods in an ambiguous way will cause compile time error.
// So we cannot call System.out.println(VALUE); because it will be ambiguous as there are two VALUE definitions.
// InterfaceTest it = new InterfaceTest();
// System.out.println(((T1)it).VALUE); will be valid and print 1.