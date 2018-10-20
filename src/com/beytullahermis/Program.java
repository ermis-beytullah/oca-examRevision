package com.beytullahermis;

import java.util.Arrays;

public class Program {

    static {
        x = 10;
        y = 5;
    }

    final static int x;
    final static int y;
    final static int j = 32;

    public static void main(String[] args) throws java.io.IOException, ClassNotFoundException {
        int aa[] = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        System.out.println(aa[3] == b[0][2]);
        System.out.println("" + (aa[2] == b[2][1]));
        System.out.println("*************");

        int ints[][] = new int[3][];
        ints[1] = new int[]{1, 2, 3};
        ints[2] = new int[]{4, 5};

        System.out.println(ints[1][1]);

        String[][] strings = {{"A", "Z"}, {"C", "D", "S"}, {"L"}};
//        Arrays.sort(strings);
        for (String[] str : strings) {
            for (String s : str) {
//                System.out.println(s);
            }
        }

        String s1 = "Rekha";
        String s2 = new String("Rekha");

        System.out.println(s1.equals(s2) + " ");
        System.out.println(s1 == s2);
        System.out.println("*************");

        A a = new B();
        a.method();

        Animal dog = new Dog();
        dog.sound();
        dog.run();
        System.out.println("*************");

        Person p1 = new Manager();
        System.out.println("*************");

        try {
            Program pr = new Program();
            int c = pr.x/y;
            System.out.println(c);
        } catch(ArithmeticException E) {
            System.out.println("Arithmetic Exception");
        }

        System.out.println("*************");

        Character ch = new Character('a');
        System.out.println(Character.isLetterOrDigit(ch));
        System.out.println("*************");

        char c = 'A';
        System.out.println((char)calc(c));
        System.out.println("*************");

        String []x = {"A", "B", "C", "D", "E"};
        nxt(x);
        for(String s:x)
            System.out.println(s + "");
        System.out.println("*************");

        String[] strings2 = {"N", "L", "n", "O", "S"};
        Arrays.sort(strings2);
        for(String s: strings2) {
            System.out.println(s);
        }
        System.out.println("*************");

        int[] a1 = {2, -1, 4, 5, 3};
        int[] a2 = {2, -1, 4, 5, 3};

        System.out.println((a1 == a2) + "");
        System.out.println(Arrays.equals(a1, a2) + "");
//        System.out.println(Arrays.deepEquals(a1, a2) + "");
    }

    static void nxt(Object o) {
        String []y = (String[]) o;
        for(int i = 5, j = 0;i > 0; --i, j++) {
            y[j] = Integer.toString(i);
        }
    }

    static int calc(int i) {
        return (i + j);
    }
}
