package Test7;

public class IfTest {

    public static void main(String[] args) {

        if(true)
            if(false)
                System.out.println("True False");
        else
            System.out.println("True True");                    // Here the 'else' is associated with the last if() and not the first if().
    }
}
