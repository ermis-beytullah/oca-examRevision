package Test7;

public class ArrayTest {

    public static void main(String[] args) {

        int i = 1;
        int[] iArr = {1};

        incr(i);
        incr(iArr);
        System.out.println("i = " + i + " iArr[0] = " + iArr[0]);
    }

    public static int incr(int n) {
       return n++;
    }

    public static int incr(int[] n) {          // Arrays are proper objects( i.e iArr instanceof Object returns true) and Object references are passed by value(so effectively, it seems as though the objects are being passed by reference).
       return n[0]++;                                 // So the value of reference of iArr is passed to the method incr(int[] i); This method changes the actual value of the int element at 0.
    }
}
