package Test7;

class X {

    int val = 10;
}

class Y extends X {
    Y val = null;
}

public class PrecedenceTest extends X {

    public static void main(String[] args) {

        Y y = new Y();

        int k = ((X)y).val;

        System.out.println(k);
    }
}

// The code pits the precedence of the cast operator and the dot operator against each other. In Java, the dot operator has higher precedence that the cast operator.
// That is why, while evaluating (X) y.val, y.val is evaluated first. This returns the val variable defined in class Y, which is of type Y.
// Since Y extends X, it is okay to cast y.val to X.