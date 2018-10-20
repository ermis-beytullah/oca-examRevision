package Test1;

public class myClass {

    public static void main(String[] args) {
         char c;
         int i;
         c = 'a';
         i = c;
         i++;
//         c = i; implicit narrowing will not take - cannot assign an int variable to a char.
         c++;

//         *********************
         String mStr = "123";
         long m = new Long(mStr);
         long n = Long.parseLong(mStr);
//         long o = Long.longValue(mStr); LongValue is non-static and cannot be accessed from a static context.
//         long p = (new Long()).parseLong(mStr); Long(or any wrapper class) does not have a non-args constructor, so new Long() is invalid.
         long q = Long.valueOf(mStr).longValue();

    }
}
