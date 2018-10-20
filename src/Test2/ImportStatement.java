package Test2;

import java.io.*; // This will make all classes of java.io package available.

// import java.lang.* // Although we can import java.lang package explicitly, it is not required because this package os always imported by the caller.

// import java.io.OutputStreamWriter // This will only make OutputStreamWriter available. PrintWriter class will still be unreachable.

public class ImportStatement {

    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        pw.print("hello");
    }
}
