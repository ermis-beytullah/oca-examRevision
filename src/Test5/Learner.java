package Test5;

public class Learner {

    public static void main(String[] args) {

        String[] datarr = new String[4];
                                            // The first element is initialised to default value of null, so it does not throw an exception at runtime.
        datarr[1] = "Bill";
        datarr[2] = "Steve";
        datarr[3] = "Larry";

        try {
            for(String data : datarr) {
                System.out.println(data + " ");
            }
        }
        catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
