package chap4.UnderstandingArrays;

public class Page199 {
    public static void main(String[] args) {
//        Using Methods with Varargs
//        When you’re creating an array yourself, it looks like what we’ve seen thus far.
//        When one is passed to your method, there is another way it can look.
//        Here are three examples with a main() method:

//        public static void main(String[] args)
//        public static void main(String args[])
//        public static void main(String… args) // varargs
//
//        The third example uses a syntax called varargs (variable arguments),
//        which you saw in Chapter 1. You learn how to call a method using varargs in
//        Chapter 5, “Methods.” For now, all you need to know is that you can use a
//        variable defined using varargs as if it were a normal array.
//        For example, args.length and args[0] are legal.

//        Working with Arrays of Arrays
//        Arrays are objects, and of course, array components can be objects.
//        It doesn’t take much time, rubbing those two facts together,
//        to wonder whether arrays can hold other arrays, and of course, they can.
//
//        Creating an Array of Arrays
//        Multiple array separators are all it takes to declare arrays of arrays.
//        While they aren’t really multidimensional, it helps to think of them as such.
//        You can locate them with the type or variable name in the declaration, just as before:

        int[][] vars1;               // 2D array
        int vars2[][];              // 2D array
        int[] vars3[];               // 2D array
        int[] vars4[], space[][];  // 2D and 3D arrays

//        The first two examples are nothing surprising and declare a two-dimensional (2D) array.
//        The third example also declares a 2D array.
//        There’s no good reason to use this style other than to confuse readers with your code.
//        The final example declares two arrays on the same line.
//        Adding up the brackets, we see that the vars4 is a 2D array and space is a 3D array.
//        Again, there’s no reason to use this style other than to confuse readers of your code.
//        The exam creators like to try to confuse you, though.
//        Luckily, you are on to them and won’t let this happen to you!
//        You can specify the size of your array and the array it contains in the declaration if you like:

        String[][] rectangle = new String[3][2];

//        Now suppose we set one of these values:
        rectangle[0][1] = "set";


//
    }
}
