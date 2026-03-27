package chap9.d4UsingTheQueueAndDequeInterfaces.page499;

import java.util.LinkedList;
import java.util.Queue;

public class Page499 {
    public static void main(String[] args) {
//        Working with Queue and Deque Methods

//        The Queue interface contains six methods, shown in Table 9.3.
//        There are three capabilities, each with two versions of the methods: one that throws an exception,
//        and one that uses the return type to convey the same information.
//        We’ve bolded the ones that throw an exception when something goes wrong,
//        like trying to read from an empty Queue.

//        Functionality                             Methods
//       ADD TO THE BACK:                           boolean add(E e)
//                                                  boolean offer(E e)
//       READ FROM THE FRONT:                       E element()
//                                                  E peek()
//       GET AND REMOVE FRON THE FRONT:             E remove()
//                                                  E poll()

//        Let’s look at the following simple queue example:
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(4);
        System.out.println(queue.remove());   // 10
        System.out.println(queue.peek());     // 4

//        Lines 26 and 27 add elements to the queue.
//        Line 28 asks the first element waiting the longest to come off the queue.
//        Line 28 checks for the next entry in the queue while leaving it in place.
    }
}
