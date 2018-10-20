package Test4;

class ConA {

    public ConA() {} // A1
    public ConA(String s) {
        this();
        System.out.println("ConA : " + s);      // A2       // Constructor here is never called in creation of an object of class ConC.
    }                                                       // Because ConB has no defined constructor and so a default no-args constructor will be called, which will call the no-argument constructor in class ConA.
}

class ConB {
    public int ConB(String s) {
        System.out.println("ConB : " + s);      // B1       // ConB will never be called in creation of objects of class ConA, ConB and ConC.
        return 0;                                           // ConB is not a constructor. It is returning an int, a constructor should not have any return types. Not even void !!
    }
}

class ConC {
    private ConC() {                                        // Class ConC can be instantiated in two ways by users of class ConC.
        super();        // C1                               // Since one constructor is private, users of this class can use only the two public constructors from outside the class.
    }
    public ConC(String s) {
        this();
        System.out.println("ConC : " + s);      // C2
    }
    public ConC(int i) {}     // C3
}


// At least one of the constructors of each class is called as a result of constructing an object of class ConC.