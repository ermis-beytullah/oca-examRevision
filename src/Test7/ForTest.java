package Test7;

public class ForTest {

    public static void main(String[] args) {


        for(int i = 0; i < 10; i++) {               // The scope of a local variable declared in for() statement is the rest of the for() statement, including it's own initialiser.
            System.out.println(i + " ");
        }

        for(int i = 0; i > 0; i--) {
            System.out.println(i + " ");
        }

        int i = 20;                                 // If we place this line above the first for() statement within the main() method then there is a redeclaration of i in the first for() which is not legal.
        System.out.println(i + " ");                // Also places line 17 above 16 is also not legal as the variable i will become out of scope.
    }
}
