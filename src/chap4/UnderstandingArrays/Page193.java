package chap4.UnderstandingArrays;

public class Page193 {
    public static void main(String[] args) {
//        Using an Array
//        Now that you know how to create an array, let’s try accessing one:
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);           // 3
        System.out.println(mammals[0]);               // monkey
        System.out.println(mammals[1]);               // chimp
        System.out.println(mammals[2]);               // donkey

//        Line 7 declares and initializes the array.
//        Line 8 tells us how many elements the array can hold.
//        The rest of the code prints the array.
//        Notice that elements are indexed starting with 0.
//        This should be familiar from String and StringBuilder, which also start counting with 0.
//        Those classes also counted length as the number of elements.
//        Note that there are no parentheses after length since it is not a method.
//        Watch out for compiler errors like the following on the exam!
        String[] mammals2 = {"monkey", "chimp", "donkey"};
//        System.out.println(mammals2.length());           // DOES NOT COMPILE
        System.out.println(mammals2.length);  // no parentheses after length , it's not a method

//        To make sure you understand how length works, what do you think this prints ?
        var birds = new String[6];
        System.out.println(birds.length);

//        The answer is 6. Even though all six elements of the array are null,
//        there are still six of them.The length
//        attribute does not consider what is in the array;
//        it considers only how many slots have been allocated.
//        It is very common to use a loop when reading from or writing to an array.This loop sets each element of
//        numbers to five higher than the current index:
        var numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;
        for (int n : numbers)
            System.out.println(n);

//        Line 5 simply instantiates an array with 10 slots.Line 6 is a for loop that uses an extremely common
//        pattern.It starts at index 0, which is where an array begins as well.It keeps going, one at a time, until
//        it hits the end of the array.Line 7 sets the current element of numbers to the index of the element plus 5.
//        Lines 8 and 9 print the numbers in the array, using the for -each loop that you learned about in Chapter 3, “
//        Making Decisions.”
//        The exam will test whether you are being observant by trying to access elements that are not in the array.
//        Can you tell why each of these throws an ArrayIndexOutOfBoundsException for our array of size 10 ?
//        numbers = new int[10];
//        numbers[10] = 3;
//
//        numbers[numbers.length] = 5;
//
//        for (int i = 0; i <= numbers.length; i++)
//            numbers[i] = i + 5;

//        The first one is trying to see whether you know that indexes start with 0. Since we have 10 elements in
//        our array, this means only numbers[0] through numbers[ 9]are valid.The second example assumes you are
//        clever enough to know that 10 is invalid and disguises it by using the length field.However, the length is
//        always one more than the maximum valid index.Finally, the for loop incorrectly uses <= instead of<, which is
//        also a way of referring to that tenth index.
    }
}
