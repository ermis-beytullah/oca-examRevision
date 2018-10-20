package Test1;

public class TestClass {

    public static void main(String[] args) {

        try {
            hello();
        }
        catch(MyException me) {
            System.out.println(me);
        }

        System.out.println("********************");
    int j, k, l;
    j = k = l = 9;
        System.out.println(j);

        System.out.println("***************");

        int i;
        int p;
        for(i = 0, p = 0; p < i; ++p, i++) {
            System.out.println(i + " " + p);
        }
        System.out.println(i + " " + p);

        System.out.println("*****************");
        System.out.println(new MNOP().x + ", " + new MNOP().y );
        System.out.println("*****************");

        A o1 = new C();
        B o2 = (B) o1;
        System.out.println(o1.m1());
        System.out.println(o2.i);
        System.out.println("*****************");

        Base b = new Base2();
        System.out.println(b.getValue());
    }



    static void hello() throws MyException {

        int[] dear = new int[7];
        dear[0] = 747;
        foo();
    }

    static void foo() throws MyException {

        throw new MyException("Exception from foo");
    }

}

class ABCD {
    int x = 10;
    static int y = 20;
}

class MNOP extends ABCD {
    int  x = 30;
    static int y = 40;
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

class A {

    int i = 10;
    int m1() {
        return i;
    }
}

class B extends A {

    int i = 20;
    int m1() {
        return i;
    }
}

class C extends B {

    int i = 30;
    int m1() {
        return i;
    }
}

class Base {

    public short getValue() {
        return 1;
    }
}

class Base2 extends Base {
//    public byte getValue() { In case of overriding, the return type of the overriding method must match exactly to the return type of the overridden method if the return type is a primitive.
//        return 2;
//}
}
