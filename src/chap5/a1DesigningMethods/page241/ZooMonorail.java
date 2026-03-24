package chap5.DesigningMethods.page241;

//Exception List

//In Java, code can indicate that something went wrong by throwing an exception.
// We cover this in Chapter 11, “Exceptions and Localization.”
// For now, you just need to know that it is optional and where in the method declaration
// it goes if present. For example, InterruptedException is a type of Exception.
// You can list as many types of exceptions as you want in this clause, separated by commas. Here’s an example:
public class ZooMonorail {
    public void zeroExceptions() {}

    public void oneException() throws IllegalArgumentException {}

    public void twoExceptions() throws
            IllegalArgumentException, InterruptedException {}
}

//While the list of exceptions is optional,
// You learn more about this, as well as how methods calling them may be required to
// handle these exception declarations, in Chapter 11.
