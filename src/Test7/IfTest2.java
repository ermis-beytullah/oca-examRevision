package Test7;

public class IfTest2 {

    public static void ifTest(boolean flag) {

        if(flag) // 1
            if(flag) // 2
                if(flag) // 3
                    System.out.println("False True");
        else // 4                                               // else at 4 is associated with if at 3.
                    System.out.println("True False");
        else // 5                                               // else at 5 is associated with if at 2
                System.out.println("True True");
        else System.out.println("False False");
    }
}

// The if and else statements don't cascade. They are like opening and closing brackets.