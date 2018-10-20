package Test7;

public class MathOperator {

    public static void main(String[] args) {

        byte starting = 3;
        short firstvalue = 5;
        int secondValue = 7;

        int functionValue = (int)(starting/2 + firstvalue/2 + (int) firstvalue/3) + secondValue/2;

        System.out.println(functionValue);
    }
}

// Whenever both the operands of a mathematical operator are integral types except long, the result is always the integer value that remains after truncating the functional value.
// For example, 5/3  is 1.66666 but the result will be 1 after removing the fractional part. There is no rounding off.