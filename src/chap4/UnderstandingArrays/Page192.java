package chap4.UnderstandingArrays;

public class Page192 {

    public static void main(String[] args) {
//        As a quick review, what do you think this array points to?
//        public class Names {
//            String names[];
//        }

        Names n = new Names();
        System.out.println(n.names);

//        The answer is null. The code never instantiated the array, so it is just a reference variable to null. Let’s try that again: what do you think this array points to?
//        public class Names {
//            String names[] = new String[2];
//        }

//        It is an array because it has brackets. It is an array of type String since that is the type mentioned in the declaration. It has two elements because the length is 2. Each of those two slots currently is null but has the potential to point to a String object.
//        Remember casting from the previous chapter when you wanted to force a bigger type into a smaller type? You can do that with arrays too:
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder();   // DOES NOT COMPILE
//        objects[0] = new StringBuilder();        // Careful!  array is of type string, will fail at runtime if wrong type

//        Line 3 creates an array of type String.Line 4 doesn’t require a cast because Object is a broader type
//        than String.On line 5, a cast is needed because we are moving to a more specific type.Line 6 doesn’t compile
//        because a String[] allows only String objects, and StringBuilder is not a String.
//                Line 7 is where this gets interesting.From the point of view of the compiler, this is just
//        fine.A StringBuilder object can clearly go in an Object[].The problem is that we don’t actually have an
//        Object[].We have a String[] referred to from an Object[] variable.At runtime, the code throws
//        an ArrayStoreException.You don’t need to memorize the name of this exception, but you do need to know that this
//        line will compile and throw an exception.

    }
}

class Names {
    String names[];
};
