package Test5;

public class InstanceOf {

    public static void main(String[] args) {

        short s = 9;

//        Short k = new Short(9);               // This line will not compile because Short does not have a constructor that takes an int value.
        Short k = new Short( (short)9);         // This will work.

//        System.out.println(s instanceof Short);       // The left operand of instanceof MUST be a reference variable and not a primitive.
        System.out.println(k instanceof Short);         // This will work.

//        System.out.println(k instanceof s);   // Right operand of instanceof MUST be a reference type name, i.e a class, an interface or an enum name.

        int i = 9;
        System.out.println(s == i);     // Any two integral primitives can be compared using == operator.

//        Boolean b = s instanceof Number;      // Same problem as in line 12.

        Integer I = 9;
//        System.out.println(k == I);    // This will not work because k and I are referring to objects that don't have an IS-a relationship among themselves.

        System.out.println(s == I);     // This will work.
    }
}
