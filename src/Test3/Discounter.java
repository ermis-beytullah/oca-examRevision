package Test3;

public class Discounter {

    static double percent;                              // Had percent been defined as final so - static final double percent = 0; the code would work and print 3000.0.
    int offset = 10, base = 50;

    public static double calc(double value) {
        int coupon, offset, base;

        if(percent < 10) {
            coupon = 15;
            offset = 20;
            base = 10;
        }

//        return coupon * offset * value / 100;         // Static and instance variables are automatically assigned a value even if we dont initialise them explicitly but local variables must be initialised explicitly before they are used.
        return 10.0;
    }

    public static void main(String[] args) {
        System.out.println(calc(100));
    }
}
