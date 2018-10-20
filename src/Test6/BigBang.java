package Test6;

abstract class Bang {

    // abstract void f(); // 0      // If this line is uncommented, then either the class BigBang will have to be declared as abstract or it has to implement method f().
    final void g() {}
    // final void h() {} // 1       // If this line is uncommented, then it will fail to compile because BigBang will try to override a final method.
    protected static int i;
    private int j;
}

public final class BigBang extends Bang {

    // BigBang(int n) {m = n;} // 2     // If this line is uncommented, it will fail to compile as BigBang will no longer have the default constructor that is used in the main() method.
    public static void main(String[] args) {

        Bang mc  = new BigBang();
    }

    void h() {}
    // void k() {i++;} // 3     // This is the only line that will compile if it was uncommented.
    // void l() {j++;} // 4     // If this line is uncommented, it will also fail as the method will try to access the private member j of the superclass.
    int m;
}
