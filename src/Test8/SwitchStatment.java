package Test8;

public class SwitchStatment {

    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {

            boolean flag = false;
            switch (i) {
//                flag = true;      // We cannot have unlabeled block of code inside a switch block. Any code must succeed a case label(or default label). Since there is no case statement in this switch block, there is no way line flag = true; can be reached. So it will not compile.
            }

            if(flag) System.out.println(i);
        }
    }
}
