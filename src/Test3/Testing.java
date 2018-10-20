package Test3;

public class Testing {

    public static void main(String[] args) {

        boolean hasParams = (args == null ? false : true);      // The args array is never null. If the program is run without any arguments, args points to a String array of length 0. Therefore, hasParams will be true and it will print "has params" then "no params".
        if (hasParams) {
            System.out.println("has params");
        }
        {
            System.out.println("no params");
        }
    }
}
