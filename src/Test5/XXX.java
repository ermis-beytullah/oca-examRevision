package Test5;

public class XXX {

    public void m() {           // Here method m() in XXX does not declare a checked Exception in it's throws clause, therefore method m() in YYY cannot declare any checked Exception in its throws clause either.

        throw new RuntimeException();
    }
}

class YYY extends XXX {

//    public void m() throws Exception{             // An overriding method can only throw the same or a subset of the checked Exceptions in the throws clause of the overridden method.
//                                                  // Class YYY, therefore will not compile.
//        throw new Exception();
//    }
}
