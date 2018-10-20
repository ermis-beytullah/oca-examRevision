package Test5;

import java.util.*;

public class arrayList {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("val1");
//        list.add(2, "val2");                       // This line will throw java.lang.IndexOutOfBoundsException. To be able to put a value at index 2, the ArrayList must have at least 2 values already.
        list.add(1, "val3");
        System.out.println(list);
    }
}
