package Test2;

public class Switch {

    public static boolean getBool() {
        return true;
    }

    public static String getString() {
        return "true";
    }

    public static void main(String[] args) {

//        switch(getBool()) {           // Cannot use a boolean in a switch statement and for case statements. The code will not compile.
            switch(getString()){

//          case true:                  // We will also need to change the case label from true to "true".
            case "true":
                System.out.println("true");
                break;

                default:
                    System.out.println("none");
                    break;
        }
    }

}
