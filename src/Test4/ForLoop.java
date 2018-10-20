package Test4;

public class ForLoop {

    public static void main(String[] args) {

//        for : for(int i = 0; i < 10; i++) {           // The for keyword cannot be used as a label for a loop. We can however use other identifiers as a label.
//            for(int j = 0; j < 10; j++) {
//                if(i + j > 10) break for;
//            }

//            System.out.println("hello");
//        }

        String String = "";         // This is a valid identifier.

        Object: for(int i = 0; i < 10; i++) {       // This is a valid identifier too.
            for(int j = 0; j < 10; j++) {
                if(i + j > 10) break Object;
            }
            System.out.println("hello");        // It will print 'hello' two times.
        }
    }
}
