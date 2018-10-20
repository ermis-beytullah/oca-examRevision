package Test2;

import java.util.ArrayList;

public class Student {

    private ArrayList<Integer> scores; // made the scores field private to improve encapsulation of the class.
    private double average;

    public ArrayList<Integer> getScores() {
        return new ArrayList<>(scores); // If we return the same score list, the caller would be able to add or remove elements from it. This can be prevented by returning a copy of the list.
    }

    public double getAverage() {
        return average;
    }

    private void computeAverage() {
        //valid code to compute.
        // average = ... update average value.
    }

    public Student() {
        computeAverage();
    }
}
