package Test3;

public class SubstringTest {

    public static void main(String[] args) {

     int i = 0;

     boolean bool1 = true;
     boolean bool2 = false;
     boolean bool = false;
     bool = (bool2 & method1("1"));
     bool = (bool2 && method1("2"));
     bool = (bool1 | method1("3"));
     bool = (bool1 || method1("4"));

    }

    public static boolean method1(String str) {

        int p = 2;
        System.out.println(str);
        return true;
    }
}
