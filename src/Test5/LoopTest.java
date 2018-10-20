package Test5;

public class LoopTest {

    int k = 5;

    public boolean checkIt(int k) {
        return k-- > 0 ? true : false;          // Any changes made to k in the checkIt() method would not affect the instance variable k. For checkIt() method to access the instance variable k, we need to do this.k.
    }

    public void printThem() {

        while(checkIt(k)) {
//            System.out.println(k);            // This line will cause an infinite loop because the value of k will always be 5.
            System.out.println(k--);            // This line will print the values 54321.
        }
    }

    public static void main(String[] args) {

        new LoopTest().printThem();
    }
}
