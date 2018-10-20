package Test8;

interface House {

    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Bungalow extends House {

    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House {

}

public class TestClass {

    public static void main(String[] args) {

        House h = new MyHouse();

        System.out.println(h.getAddress());
    }
}
