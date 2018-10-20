package Test6;

class Game {

    public void play() throws Exception {
        System.out.println("Playing...");
    }
}

public class Soccer extends Game {

    public void play() {
        System.out.println("Playing soccer...");
    }

    public static void main(String[] args) {
        Game g = new Soccer();
//        g.play();                         // At compile time, compiler assumes that g.play() might throw an exception, because Game's play() method declares it.
                                            // So the compiler expects this call to be either wrapped in a try-catch block or the main() method to have a throws clause.
    }
}
