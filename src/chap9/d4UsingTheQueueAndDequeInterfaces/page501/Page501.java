package chap9.d4UsingTheQueueAndDequeInterfaces.page501;


import java.util.ArrayDeque;
import java.util.Deque;

public class Page501 {
    public static void main(String[] args) {
//        Let’s try another one using the Deque as a stack:
        Deque<Integer> stack = new ArrayDeque<>();
//        Below shows what the stack looks like at each step of the code.
//        Lines 14 and 15 successfully put an element on the front/top of the stack.
//        The remaining code looks at the front as well.
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

//        When using a Deque, it is really important to determine if it is being used as a FIFO queue,
//        a LIFO stack, or a double-ended queue. To review, a FIFO queue is like a line of people.
//        You get on in the back and off in the front. A LIFO stack is like a stack of plates.
//        You put the plate on the top and take it off the top. A double-ended queue uses both ends.

    }
}
