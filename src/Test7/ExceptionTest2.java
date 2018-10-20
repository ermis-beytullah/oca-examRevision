package Test7;

class NewException extends Exception {

}

class AnotherException extends Exception {

}

public class ExceptionTest2 {

    public static void main(String[] args) throws Exception {

//        try {
//            m2();                             // m2() throws NewException, which is not caught anywhere. But before exiting out of the main() method, finally must be executed.
//        }
//        finally {
//            m3();                             // Since, finally throws AnotherException, the NewException in the try block is ignored and AnotherException is thrown from the main() method.
//        }
    }

    public static void m2() throws NewException {

        throw new NewException();
    }

    public static void m3() throws AnotherException {

        throw new AnotherException();
    }
}
