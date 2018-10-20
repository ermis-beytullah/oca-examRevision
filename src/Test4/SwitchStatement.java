package Test4;

public class SwitchStatement {

    public int luckNumber(int seed) {
        if(seed > 10) return seed % 10;
        int x = 0;

        try {
            if(seed % 2 == 0) throw new Exception("No Even number");
            else return x;
        } catch(Exception e) {
            return 3;
        }
        finally {
            return 7;
        }
    }

    public static void main(String[] args) {

        int amount = 100, seed = 6;

        switch (new SwitchStatement().luckNumber(seed)) {

            case 3: amount = amount * 2;
            case 7: amount = amount * 2;
            case 6: amount = amount + amount;
            default:
        }
        System.out.println(amount);
    }
}
