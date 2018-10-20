package Test7;

public class SwitchStatement {

    public static void main(String[] args) {

        calculate(5);
    }

    public static void calculate(int x) {
        String val;

        switch(x) {
            case 2 :                                // When we try to access a local variable, the compiler makes sure that it is initialised in all the cases.
                default :                           // If it finds that there is a case in which it may not be initialised then it flags an error.
                    val = "def";
        }                                           // As there is no break after case 2, val will always be initialised in the switch block. So it will compile and run fine.

        System.out.println(val);
    }
}


// For example...
// int i;
// if(somecondition) i = 20;
// int k = i;

// Here, if somecondition returns false, then i remains uninitialised and the compiler flags an error.