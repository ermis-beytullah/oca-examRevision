package Test6;

import java.util.*;

public class Data {

    int value;

    Data(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {

        Data[] dataArr = new Data[] { new Data(1), new Data(2), new Data(3), new Data(4)};

        List<Data> dataList = Arrays.asList(dataArr);

        for(Data element : dataList) {

//            dataList.removeIf( (Data d) -> { return d.value % 2 == 0;} );

//            System.out.println("Removed " + d + ", ");                    // The lambda variable d is available only within the lambda body. So this line will cause a compile error.
        }

    }
}

// This code will throw an Exception if we uncomment line 25, since the list is backed by an array and the size of the array cannot change.
// We cannot add or remove elements from a list backed by an array.
// We may however, change the elements of the List using list.set(index, element); method.
