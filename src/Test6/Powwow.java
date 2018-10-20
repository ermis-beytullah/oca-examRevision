package Test6;

interface Pow {

    static void wow() {
        System.out.println("In Pow.wow");
    }
}

abstract class Wow implements Pow {

    static void wow() {
        System.out.println("In Wow.wow");
    }
}

public class Powwow extends Wow implements Pow {

    public static void main(String[] args) {
        Powwow p = new Powwow();

        p.wow();        // We can use a reference variable to invoke a static method of a class or superclass.
        Pow.wow();      // We cannot invoke a static method of an interface using a reference variable. We would need to use the name of the Interface if we want to invoke the static method wow() defined in Pow interface.
    }

}
