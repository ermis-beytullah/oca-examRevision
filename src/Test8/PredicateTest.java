package Test8;

import java.util.function.Predicate;

class Employee {
    int age;
}

public class PredicateTest {

    // Q - Which of the following lambda expressions can be used to invoke a method that accepts a java.util.function.Predicate as an argument?



//    x -> System.out.println(x)  // The body part of the lambda expression that is meant to capture the Predicate interface must return a boolean(because the only abstract method in this interface returns boolean).

//    x -> System.out.println(x);   // 1. The body part must return a boolean but this returns void.
                                    // 2. This is syntactically invalid as well because of the semi-colon.

//    x -> x == null            // This line is correct.

//    () -> true;       // The implementation of Predicate interface must have a method that takes exactly one parameter. Here, the parameter list is empty.

//    x -> true;        // This is also correct.

    public static boolean validateEmployee(Employee e, Predicate<Employee> p) {
        return p.test(e);
    }

    public static void main(String [] args) {

        Employee e = new Employee();

//        System.out.println(validateEmployee(e, e -> e.age < 10000));      // The variable e is already defined in the scope and we cannot use the variable name 'e' in the body part of the lambda expression.
                                                                            // A lambda expression does not create a new scope for variables.
    }
}
