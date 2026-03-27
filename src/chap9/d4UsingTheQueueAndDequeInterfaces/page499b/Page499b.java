package chap9.d4UsingTheQueueAndDequeInterfaces.page499b;

import java.util.Deque;
import java.util.LinkedList;

public class Page499b {
    public static void main(String[] args) {

//        Deque Interface
//        Since the Deque interface supports double-ended queues, it inherits all
//        Queue methods and adds more so that it is clear if we are working with
//        the front or back of the queue. Table 9.4 shows the methods when using it as a double-ended queue.

        //        Functionality                             Methods
//       ADD TO THE FRONY:                              void addFirst(E e)boolean
//                                                      offerFirst(E e)
//
//       ADD TO THE BACK:                                Void addLast(E e)
//                                                       public boolean offerLast(E e)
//
//       READ FROM FRONT:                                E getFirst()E
//                                                       E peekFirst()
//       READ FROM THE BACK                              E getLast()
//                                                       E peekLast()
//       GET AND REMOVE FROM FRONT                       E removeFirst()
//                                                       E pollFirst()\
//        GET AND REMOVE FROM BACK                       E removeLast()
//                                                       E pollLast()

//        Let’s try an example that works with both ends of the queue:
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(10);
        deque.offerLast(4);
        System.out.println(deque.peekFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.peekFirst());
    }
}
