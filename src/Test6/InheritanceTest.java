package Test6;

class A {

    public int getCode() {
        return 2;
    }
}

class AA extends A {

//    public long getCode() {               // Class AA is trying to override the getCode() method in A but the return type is incompatible with the A's getCode().
//        return 3;                         // When the return type of the overridden method is a primitive, the return type of the overriding method must match the return type of the overridden method (in this case both return types will need to of type int for this code to compile).
//    }

    public int getCode() {
        return 3;
    }
}

public class InheritanceTest {

    public static void main(String[] args) {

        A a = new A();
        A aa = new AA();
        System.out.println(a.getCode() + " " + aa.getCode());
    }

    public int getCode() {
        return 1;
    }
}
