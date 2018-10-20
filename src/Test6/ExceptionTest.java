package Test6;

public class ExceptionTest {                        // Follow the following control flow.

    static String s = "";

    public static void m0(int a, int b) {
        s += a;                                     // 3. m0(1, 2) first executes s += 1 (so s is not 1) and then calls m2().
        m2();
        m1(b);                                      // 5. Since, within m0(), the call to m2() is not wrapped in a try catch block, this exception further propagates up to m().
    }                                               // 6. The next line in m0(1, 2) which is m1(2) is not executed.

    public static void m1(int i) {
        s += 1;
    }

    public static void m2() {
        throw new NullPointerException("aa");       // 4. Now m2() throws an exception which is not caught by m2() so it is propagated back to m0(1, 2).
    }

    public static void m() {                        // 2. m() calls m0(1, 2).
        m0(1, 2);                            // 7. Again, m() also does not have the try catch block so the same exception is further propagated up to the main() method.
        m1(3);                                   // 8. The next line in m() which is a call to m1(3) is not called.
    }

    public static void main(String[] args) {

        try {
            m();                                    // 1. m() is called from the main() method.
        }catch (Exception e) {}                     // 9. In the main() method, the call to m() is wrapped in a try catch block and so the exception is handled here.
        System.out.println(s);                      // 10. Finally the value of s stays "1" and this is printed.
    }
}
