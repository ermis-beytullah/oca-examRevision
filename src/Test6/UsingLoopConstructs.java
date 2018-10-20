package Test6;

public class UsingLoopConstructs {

    // We have been given an array of objects and need to process this array as follows.
    // 1. Call a method on each object from first to last one by one.
    // 2. Call a method on each object from last to first one by one.
    // 3. Call a method on each object at even index(0, 2, 4, 6, etc.)

    // Enhanced for loop can be used for only for the first task. For the rest, standard loops can be used.
}

// Enhanced for loop is tailor made for processing each element of a collection( or an array) in order.
// Most importantly, it does not give you an iterating variable that you can manipulate and that makes it impossible to change the order or to skip an element.
// Therefore, tasks 1. and 2. cannot be done by an enhanced for loop.

// The standard for loop is very flexible. It can pretty much do anything...

class StandardForLoop {

    // processing in reverse
//    for(int i = arr.length-1; i  >= 0; i--) {
//        arr[i].m1();
//    }

    // processing in alternate

//    for(int i = 0; i < arr.length; i++) {
//        arr[i].m1();
//    }
}