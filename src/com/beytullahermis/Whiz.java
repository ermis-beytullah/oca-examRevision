package com.beytullahermis;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Whiz{

    static int x = 1;
    static String o = "";
    static int i = 2;
    int xx = 50;
    static int y = 10;

    public static void main(String[] args) {

        for(x = 1; x < 3; x++) {
            System.out.println(x);
        }
        System.out.println(x);

        System.out.println("****************");

        for(int x =9; x > 0; x--) {
            for(int y = 8; x > y; y++) {
                System.out.println(x + y);
            }
        }

        System.out.println("****************");

        z:for(int x = 3; x < 8; x++) {
            if(x==4)
                continue;
            if(x==4)
//                break z;
            o += x;
        }

        System.out.println(o);

        int[] nums = {0, 1, 2, 3, 4};
        for(int x:nums) {
            System.out.println(x);
//            continue;


//            System.out.println(x + Whiz.x);
        }

        System.out.println("****************");

        int _6 = 6;

        if(_6 > 6)
            System.out.println(">6");
        System.out.println("or");
//        else{
            System.out.println("<6");

        System.out.println("****************");

        char[] chars = {'1', 'Z', '0', '-', '8', '1',};
        StringBuilder sb = new StringBuilder();
        sb.append(chars, 0, chars.length-1);
        sb.append('0');
        sb.append("8");
        System.out.println(sb);
        System.out.println("****************");

        Integer in = 10;
        System.out.println(method(in));
        System.out.println("****************");

        new Bird("parrot");
        System.out.println("****************");

        int array[] = new int[i];
        array[0] = 66;
        array[1] = 67;
        System.out.println(array[1]);
        System.out.println("*************");

        try {
            throw method1();
        }catch(IOException e) {
            System.out.println("caught");
        }
        System.out.println("*************");

        try {
            print();
        } catch (Exception e) { }
        System.out.println("*************");

        String s ="A";
        final String c1 = "A";
        final String c2 = "B";
        final String c3 = "C";

        switch(s) {
            case c1: {
                System.out.println("A");
//                break;
            }
            default: {
                System.out.println("default");
            }
            case c2: {
                System.out.println("B");
//                break;
            }
            case c3: {
                System.out.println("C");
//                break;
            }
        }
        System.out.println("*************");

        int value1 = 1;
        int value2 = 2;

        if(value1 == value2)
            System.out.println("1");
        if(value1 != value2)
            System.out.println("2");
        if(value1 > value2)
            System.out.println(3);
        if(value1 < value2)
            System.out.println(4);
        if(value1 >= value2)
        System.out.println("5");
        System.out.println("*************");

        int y = 5;
        if(false && y++ == 11)
            System.out.println(y);
        else if(true || --y == 4)
            System.out.println(y);
        else{}
        System.out.println("*************");

        for(int j = 0, k = 5; j < k; k--);
        for(int j = 0; j++ < 3;);
        for(int i = 0; i < 5; i++, System.out.println(i + ".Hi "));
        System.out.println("*************");

        int arr[][] = {{1, 3, 5}, {7, 8}};
        out:for(int []a: arr){
            for(int i: a) {
                if(i == 7) continue;
                System.out.println(i + "");
                if(i == 3) break;
            }
        }
        System.out.println("*************");

        A a = new C();
        C cc =(C)a;
        cc.meth();
        System.out.println("*************");

        IMove.print();
        System.out.println("*************");

        StringBuilder ss = new StringBuilder("IZ0");
        ss.append("-808");
        System.out.println(ss.length() + " ");
        System.out.println(ss.capacity());
        System.out.println("*************");

        System.out.println(IA.s);
        System.out.println(IA.value);
        System.out.println("*************");

    }

    interface IA {
        static int value = 15;
        String s = "Value is: ";
    }

    interface IMove {
        public static void main(String[] args) {
            System.out.println("Move");
        }
        public static void print(){}
    }

    private static String method(Object c) {
        return c.toString();
    }

    public static IOException method1() {
        try {
            throw new FileNotFoundException();
        } catch(FileNotFoundException e) {
            return new FileNotFoundException();
        }
    }

    static void print() {
        try {
            throw new NullPointerException();
        } catch (ClassCastException e) {
            System.out.println("Class cast");
        } finally {
            System.out.println("Final");
        }

        System.out.println("OCAJP");
    }
}
