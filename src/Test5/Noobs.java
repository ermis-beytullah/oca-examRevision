package Test5;

public class Noobs {

    public void m(int a) {

        System.out.println("In int ");
    }

    public void m(char c) {

        System.out.println("In char ");
    }

    public static void main(String[] args) {

        Noobs n = new Noobs();

        int a = 'a';
        char c = 9;

        n.m(a);         // The method m(int a) is most applicable for this call so it prints In int.
        n.m(c);         // The method m(char c) is most applicable for this call so it prints In char.
    }
}
