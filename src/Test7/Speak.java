package Test7;

public class Speak {

    public static void main(String[] args) {

        Speak s = new GoodSpeak();

//        s.up();                               // It will not compile because the class reference s is Speak, which does not have the method up().

        ((Tone)s).up();

        ((GoodSpeak)s).up();
    }
}

class GoodSpeak  extends Speak implements Tone {

    public void up() {

        System.out.println("UP UP UP");
    }
}

interface Tone {

    void up();
}
