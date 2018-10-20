package Test2;

public interface TestInterface {

    void compute();                     // All interface methods have to be public, no access control keyword in the method declaration also means public in an interface. The absence of access control keyword in the method defined in a class means package protected.

    public void compute1();             // This is correct method declaration.

//    public final void compute2();     // Final is not allowed.

//    static void compute3();           // An interface can have a static method but the method needs to have a body {}.

//    protected void compute4;          // All interface methods need to be public.
}
