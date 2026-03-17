package chap1.UnderstandingDataTypes;

public class Page28 {
    public static void main(String[] args) {
        /*The greeting reference points to a new String object, "How are you?".
        The String object does not have a name and can be accessed only via a corresponding reference.
        */
        String greeting;
        greeting = new String("How are you?");

        /*Next, reference types can be used to call methods, assuming the reference is not null.
         Primitives do not have methods declared on them.
         In this example, we can call a method on reference since it is of a reference type.
         You can tell length is a method because it has () after it.
         See if you can understand why the following snippet does not compile:
         */
        String reference = "hello";
        int len = reference.length();
        System.out.println(len);
        //int bad = len.length(); // DOES NOT COMPILE len is an int

    }

}


