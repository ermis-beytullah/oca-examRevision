package Test6;

import java.util.*;

public class RemoveObject {


    public static void main(String[] args) {

        List s1 = new ArrayList();

        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");

        System.out.println("s1 = " + s1);

        if (s1.remove("a")) {                                           // ArrayList's remove(Object ) method removes the first occurence of the given element and returns true if found.
            System.out.println("s1 after first remove call = " + s1);       // It does not remove all occurences of the element.
                if (s1.remove("a")) {
                System.out.println("s1 after second remove call = " + s1);
                s1.remove("b");
            } else {
                s1.remove("c");
            }
        }
        System.out.println("s1 = " + s1);
    }

}
