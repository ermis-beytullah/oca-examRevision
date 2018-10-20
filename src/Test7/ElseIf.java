package Test7;

public class ElseIf {

    public static void main(String[] args) {

        boolean flag = true;

        if(flag = false) {
            System.out.println("1");
        } else if(flag) {
            System.out.println("2");                // We can have multiple else if statements.
        } else if(flag) {
            System.out.println("3");                // But we cannot have multiple else statements for 1 if statement.
        } else
            System.out.println("4");

    }
}
