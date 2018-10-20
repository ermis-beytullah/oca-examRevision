package Test3;

import java.util.ArrayList;

class Game {

    public void play() throws Exception {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {

    public void play(String ball) {
        System.out.println("Playing Soccer with " + ball);
    }
}

public class TestClass {

    static int si = 10;

    public static void main(String[] args) throws Exception {

        String s1 = "blooper";
        StringBuilder sb = new StringBuilder(s1);

//        s1.append("whooper");                  // append() method does not exist in the String class. It exists only in StringBuffer and StringBuilder.
        sb.append("shopper");                   // The value of sb will be bloopershopper.

        System.out.println(s1);
        System.out.println(sb);

        System.out.println("**********************");

        Game g = new Soccer();
        g.play();
        Soccer s = (Soccer)g;
        s.play("cosco");

        System.out.println("************************");

        ArrayList<Double> al = new ArrayList<>();
        System.out.println(al.indexOf(1.0));            // indexOf accepts Object as a parameter. Although 1.0 is not an object it will be boxed into a Double object.
        System.out.println(al.contains("string"));

        System.out.println("**************************");

        new TestClass();
    }

    public TestClass() {
        System.out.println(this);
    }

    public String toString() {
        return "TestClass.si = " + this.si;
    }
}
