package Test6;

class T {

    public int i = 20;
    private int j = 20;
}

class S extends T {

    private int i = 30;
    public int k = 40;
}
class U extends S {

}
public class HiddenTest {

    public static void main(String[] args) {

        U u = new U();

//        System.out.println(u.i);              // We cannot access u.i because i is private in S.
        System.out.println( ((T)u).i);          // But we can access ((T)u).i because i is public in T. Member variables are hidden and overridden.

//        System.out.println(u.j);              // We cannot access u.j because j is private in T.

        System.out.println(u.k);

    }
}
