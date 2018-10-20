package Test6;

import java.io.*;

class Great {
                                                                    // To fix this code se can do the following...
    public void doStuff() throws IOException {            // Change the doStuff() method in Great to throw IOException.(Before it declared that it throws FileNotFoundException)

    }
}

class Amazing extends Great {

    public void doStuff() throws IllegalArgumentException {        // Change the doStuff() method in Amazing to only throw IllegalArgumentException.(Before it declared that it throws IOException and IllegalArgumentException)

    }
}

public class ExceptionOverriding {

    public static void main(String[] args) throws IOException {

        Great g = new Amazing();
        g.doStuff();
    }
}

// The rule is that an overriding method cannot throw an exception that is a super class of the exception thrown by the overridden method.
