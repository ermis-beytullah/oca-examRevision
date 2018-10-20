package Test1;

public class Type1Bozo implements Bozo {

    public Type1Bozo() {

//        type = 1; Fields defined in an interface are always considered public, static and final. Cannot assign a new value Type variable.
    }

    public void jump() {
        System.out.println("jumping..." + type);
    }

    public static void main(String[] args) {
        Bozo b = new Type1Bozo();
        b.jump();
    }
}
