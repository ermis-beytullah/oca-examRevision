package Test2;

public class Test {

    public static void main(String[] args) {

        // command line : java Test close.

        if(args[0].equals("open"))
            if(args[1].equals("someone"))
                System.out.printf("Hello!");
        else System.out.println("Go away " + args[1]);
    }
}

// The Java language arbitrarily decrees that an else clause belongs to the innermost if statement, so as the first if() condition fails there is no else asoociated to execute.
// So the program does nothing, it will end without exceptions and will print nothing.
