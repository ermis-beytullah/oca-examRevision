package Test7;

public class JavaDataTypes {

    static char ch;
    static float f;
    static boolean bool;

    public static void main(String[] args) {

        System.out.println(f);          // To print the value of a float variable f, it internally calls Float.toString(f). Now this method doesnt append an 'f' at the end of the float value. That is why a float value is 0.0 is printed as 0.0 and not 0.0f.
        System.out.println(" ");
        System.out.println(ch);         // Printing a default char variable simply prints a blank space.
        System.out.println(" ");
        System.out.println(bool);
    }
}
