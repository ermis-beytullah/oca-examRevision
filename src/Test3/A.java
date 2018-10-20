package Test3;

public class A {

    public static void sM1() {
        System.out.println("In base static");
    }
}

class B extends A {

    public static void sM1() {
        System.out.println("In sub static");        // This is not overriding. The sM1() method in class A is static therefore it is shadowed by the static method sM1() in the subclass B.
    }

//    public void sM1() {                           // sM1() method is non-static therefore cannot override the static sM1() method in class A.
//        System.out.println("In sub non-static");
//    }
}
