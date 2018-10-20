package Test2;

class Data {

    private int x = 0, y = 0;

    public Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setValues(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int intVal = 0;
    String strVal = "default";

    public Data(int k) {
        this.intVal = k;
    }
}
public class TestClass {

    long l1;

    public void TestClass(long pLong) { // This is a method and not a constructor because it has a return type.
        l1 = pLong;
    }

    public static void main(String[] args) throws Exception {

        TestClass a, b;
        a = new TestClass(); // The class has an implicit default constructor since the class doesn't have any constructor defined. So this compiles fine.
//        b = new TestClass(5); // TestClass method is not a constructor, so there is no constructor to take a parameter.

        Data d = new Data(1, 1);
        d.setValues(2, 2);

        d = new Data(2, 2); // This will create a new Data object and will not change the original Data object referred to be d.

        try {
            doTest();
        }
        catch(MyException me) {
            System.out.println(me);
        }

        Data d1 = new Data(10);
        d1.strVal = "D1";
        Data d2 = d1;
        d2.intVal = 20;
        System.out.println("d2 val = " + d2.strVal);
    }

    static void doTest() throws MyException {

        int[] array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }

    static void doAnotherTest() throws MyException {

        throw new MyException("Exception from doAnotherTest");
    }
}

class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }
}
