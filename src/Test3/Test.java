package Test3;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static int i = 4;

    public static void main(String[] args) {

        int ia[][][] = new int[i][i++][i];
        System.out.println(ia.length + ", " + ia[0].length + ", " + ia[0][0].length);

        List s1 = new ArrayList();
        try {
            while(true) {
//                s1.add("sdfa");           // This will throw java.lang.OutOfMemoryError, this is not a subclass of RuntimeException or even Exception. It is a subclass of java.lang.Error.
            }
        } catch(RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println(s1.size());
    }
}
