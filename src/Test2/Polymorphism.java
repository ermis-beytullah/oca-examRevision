package Test2;

public class Polymorphism {

}

class A {
    A() {                                       // 2. Which invokes A's constructor. A's constructor now calls print().
        print();
    }

    void print() {                              // 3. Print() is a non-private method therefore polymorphic, since the class of actual object is B, B's print() is selected.
        System.out.println("A");
    }
}

class B extends A {

    int i = 4;                                  // 4. At this point in time, variable i has not been initialised(because we are in the middle of initialising A)

    public static void main(String[] args) {

        A a = new B();                          // 1. Here first B's default constructor is called. The first line of this constructor is a all to super()
        a.print();
    }

    void print() {                              // 5. So its default value is printed which is 0.
        System.out.println(i);                  // 6. Finally, 4 is printed when a.print() is called in the main method.
    }
}
