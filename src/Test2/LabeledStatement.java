package Test2;

public class LabeledStatement {

    public void method1(int i) {

        int j = (i * 30 - 2)/ 100;

        POINT1: for(; j < 10; j++) {
            boolean flag  = false;
            while(!flag) {
                if(Math.random() > 0.5) break POINT1;
            }
        }

        while(j > 0) {
            System.out.println(j--);
//            if(j == 4) break POINT1;      // A labeled break or continue statement must always exist inside the loop where the label is declared.
                                            // Here, if(j == 4) break POINT1; is a labeled break that is occurring in the second loop while the label POINT1 is declared for the first loop.
        }
    }

    public static void main(String[] args) {

        int i = 0;

        loop: {                                          // We can apply a label to any code block or a block level statement(such as a for statement) but not to declarations. For example - loopX : int i = 10;
            System.out.println("Loop Lable line");
            try{
                for(; true; i++) {
                    if(i > 5) break loop;               // Even if the break statement takes the control out of the block, the finally clause will be executed.
                }
            }
            catch (Exception e) {
                System.out.println("Exception in loop.");
            }

            finally {
                System.out.println("In Finally");
            }
        }
    }
}
