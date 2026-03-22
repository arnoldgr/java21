package ExceptionsAndLocalization;

// Chapter 11 - Exceptions and Localization
// This chapter covers how Java handles things going wrong in a program,
// and how to build apps that support different languages and regions.

public class UnderstandingExceptions {

    // Return Codes vs Exceptions
    // Instead of throwing an exception, some developers return a special value
    // like -1 to signal failure. This is called a "return code" — and the book
    // warns against it because it's easy to ignore.

    public int indexOf(String[] names, String name) {

        for (int i = 0; i < names.length; i++) {

            // Use .equals() to compare String values, not memory addresses
            if (names[i].equals(name)) {
                return i; // Name found — return its position
            }
        }

        // Name not found — returns -1 as a failure signal (the return code approach)
        return -1;
    }

    public static void main(String[] args) {

    }

}