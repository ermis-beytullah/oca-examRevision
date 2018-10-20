package Test4;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBounds {

    public static void main(String[] args) throws Exception {

        List al = new ArrayList(); // 1
        al.add(111);        // 2
        System.out.println(al.get(al.size()));  // 3
    }
}

// It will throw and exception at run time because of line //3.
// It will throw an IndexOutOfBoundsException at run time, the size() method of ArrayList returns the number of elements. Here, it returns 1.
// Since numbering in ArrayList starts from 0. al.get(1) will cause an IndexOutOfBoundsException to be thrown because only 0 is a valid index for a list of size 1.
