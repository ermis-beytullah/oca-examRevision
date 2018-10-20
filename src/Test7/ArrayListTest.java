package Test7;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) throws Exception {

        ArrayList<String> al = new ArrayList<>();

        al.add("111");
        al.add("222");
//        System.out.println(al.get(al.size()));        // size() method of ArrayList returns the number elements.
                                                        // Here, it returns 2. Since numbering in ArrayList starts with 0.
                                                        // al.get(2) will cause an IndexOutOfBoundsException to be thrown because only 0 and 1 are valid indexes for a list of size 2.
    }
}
