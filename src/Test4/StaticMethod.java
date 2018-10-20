package Test4;

public class StaticMethod {

    public static void main(String[] args) {

        StaticMethod.sayHello();

    }

        public static void sayHello() {
            System.out.println("Static Hello World");
        }

//        public void sayHello() {                      // We cannot have two methods with the same signature (name and parameter types)in one class.
//            System.out.println("Hello World");
//        }
}

class NonStaticMethod extends StaticMethod {

//    public void sayHello() {                  // Also even if we put the sayHello() method in a subclass of StaticMethod, it won't compile because we cannot override/hide a static method with a non-static method and vice versa.
//        System.out.println("Hello World");
//    }
}
