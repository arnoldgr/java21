package chap4.UsingTheStringBuilderClass;

public class Page184 {

    public static void main(String[] args) {
//        Inserting Data
//        The insert() method adds characters to the StringBuilder at the
//        Just like append(), there are lots of method signatures for different types. Here’s one:
//        public StringBuilder insert(int offset, String str)

//        Pay attention to the offset in these examples.
//        It is the index where we want to insert the requested parameter.
        var sb = new StringBuilder("animals");
        sb.insert(7, "-");                   // sb = animals-
        sb.insert(0, "-");                   // sb = -animals-
        sb.insert(4, "-");                   // sb = -ani-mals-
        System.out.println(sb);

//        Line 4 says to insert a dash at index 7, which happens to be the end of the sequence of characters.
//        Line 5 says to insert a dash at index 0, which happens to be the very beginning.
//        Finally, line 6 says to insert a dash right before index 4.
//        The exam creators will try to trip you up on this.As we add and remove
//        characters, their indexes change.When you see a question dealing with such operations,
//        draw what is going on
//        using available writing materials so you won’t be confused.

//        Deleting Contents
//        The delete() method is the opposite of the insert() method.
//        It removes characters from the sequence and returns a reference
//        to the current StringBuilder.
//        The deleteCharAt() method is convenient when you want to delete only one character.
//        The method signatures are as follows:
//        public StringBuilder delete(int startIndex, int endIndex)
//        public StringBuilder deleteCharAt(int index)

//        The following code shows how to use these methods:
        var sb3 = new StringBuilder("abcdef");
        sb3.delete(1, 3);                  // sb = adef
       // sb3.deleteCharAt(5);               // exception

//        First, we delete the characters starting with index 1 and ending right before index 3.
//        This gives us adef. Next, we ask Java to delete the character at position 5.
//        However, the remaining value is only four characters long,
//        o it throws a StringIndexOutOfBoundsException.

//        The delete() method is more flexible than some others when it comes to array indexes.
//        If you specify a second parameter that is past the end of the StringBuilder,
//        Java will just assume you meant the end. That means this code is legal:

        var sb4 = new StringBuilder("abcdef");
        sb4.delete(1, 100);                  // sb = a

//        Replacing Portions
//        The replace() method works differently for StringBuilder than it did for String.
//        The method signature is as follows:
//        public StringBuilder replace(int startIndex, int endIndex, String newString)

//        The following code shows how to use this method:
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder);  // pigsty dirty

//        First, Java deletes the characters starting with index 3 and ending right before index 6.
//        This gives us pig dirty. Then Java inserts the value "sty" in that position.
//        In this example, the number of characters removed and inserted are the same. However,
//        there is no reason they have to be. What do you think this does?
        var builder2 = new StringBuilder("pigeon dirty");
        builder2.replace(3, 100, "");
        System.out.println(builder2);

//        It prints "pig". Remember, the method is first doing a logical delete.
//        The replace() method allows specifying a second parameter that is past
//        the end of the StringBuilder. That means only the first three characters remain.

    }
}
