package Test6;

public class ImmutableObjects {

    public static Integer wiggler(Integer x) {
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args) {

        Integer dataWrapper = new Integer(5);    // However, x which was pointing to the same object as dataWrapper, is assigned a new Integer object(different from dataWrapper) containing 6.
        Integer value = wiggler(dataWrapper);

        System.out.println(dataWrapper);            // Wrapper objects are always immutable. Therefore when dataWrapper is passed into wiggler() method, it is never changed when x++; is executed.
        System.out.println(dataWrapper + value);    // If both the operands of the + operator are numeric, it adds the two operands.
                                                    // Here, the two operands are Integer 5 and Integer 15, so it unboxes them, adds them, and prints 20.
    }
}
