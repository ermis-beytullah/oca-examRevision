package Test6;

public class TryCatchFinallyTest {

    public float parseFloat(String s) {

        float f = 0.0f;

        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            f = Float.NaN;
            return f;
        }

        finally {
            return f;
        }

//        return f;             // The code will not compile if this line was uncommented, it is unreachable code because the finally statement will always be executed before this line.
    }
}
