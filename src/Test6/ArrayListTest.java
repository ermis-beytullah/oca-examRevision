package Test6;

import java.util.ArrayList;                     // Only java.lang package and the package in which the current class exists is imported automatically.
                                                // Class ArrayList is in java.util package, which is not imported automatically.
public class ArrayListTest {

    ArrayList<String> al;

    public void init() {

        al = new ArrayList<>();
        al.add("name 1");
        al.add("name 2");
    }

    public static void main(String[] args) throws Exception {

        ArrayListTest at = new ArrayListTest();
        at.init();
        System.out.println("Size = " + at.al.size());
    }
}
