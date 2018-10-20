package Test4;

public class DaysTest {

    static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

    public static void main(String[] args) {

        int index = 0;
        for(String day : days) {

            if(index == 3) {
                break;
            } else {
//                continue;                     // In the original code this line was uncommented. This will create a compile error because the code below it are unreachable.
            }

            index++;
            if(days[index].length() > 3) {
                days[index] = day.substring(0, 3);
            }
        }
        System.out.println(days[index]);
    }
}
