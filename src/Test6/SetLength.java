package Test6;

public class SetLength {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("12345678");

        sb.setLength(5);                // If the newLength argument is less than the current length, the length is changed to the specified length.
        sb.setLength(10);               // If the newLength argument is greater than or equal to the current length, sufficient null characters are appended so that length becomes the newLength argument.

        System.out.println(sb.length());
        System.out.println(sb);         // This will print "12345     " (without the quotes).
    }
}
