package Test5;

class X {

    public X() {
        System.out.println("In X");
    }
}

class Y extends X {

    public Y() {
        System.out.println("In Y");
    }

//    public Y(int x);
}

class Z extends Y {

    public Z() {
        System.out.println("In Z");
    }
}
public class ConstructorTest {

    public static void main(String[] args) {

        X x = new Z();
    }
}
