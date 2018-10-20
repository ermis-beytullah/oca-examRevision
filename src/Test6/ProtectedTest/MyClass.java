package Test6.ProtectedTest;

public class MyClass {

    protected int value = 10;       // Since value is protected, a class in another package which extends MyClass will only inherit this variable,
                                    // it cannot read or modify the value of a variable of a MyClass instance.
}
