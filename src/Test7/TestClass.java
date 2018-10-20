package Test7;

import static Test7.x.y.SM.foo;         // This is valid because this statement is importing the static member foo of class x.y.SM

// import static Test7.x.y.SM.*;       // This is valid because it is importing all the static members of class x.y.SM

//import static x.y.*;                 // x.y.* means all the classes in package x.y. Classes cannot be imported using 'import static'. We must do import x.y.* for importing classes.

//import static x.y.SM;                 // x.y.SM means we are trying to import class SM that belongs to package x.y. A class cannot be imported statically.

public class TestClass {

    public static void main(String[] args) {

        foo();

    }
}
