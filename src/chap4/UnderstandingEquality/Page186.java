package chap4.UnderstandingEquality;

public class Page186 {
    public static void main(String[] args) {
//        Understanding Equality

//        Comparing equals() and ==
//        Consider the following code that uses == with objects:
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two);   // false
        System.out.println(one == three); // true

//        Since this example isn’t dealing with primitives, we know to look for
//        whether the references are referring to the same object.
//        The one and two variables are both completely separate
//        StringBuilder objects, giving us two objects. Therefore,
//        the first print statement gives us false.
//        The three variable is more interesting.
//        Remember how StringBuilder methods like to return the current reference for chaining?
//        This means one and three both point to the same object, and the second print statement gives us true.
//        You saw earlier that equals() uses logical equality rather than object equality for String objects.
        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x.equals(z)); // true

//        This works because the authors of the String class implemented a standard method called equals() to
//        check the values inside the String rather than the string reference itself.
//        If a class doesn’t have an equals() method, Java determines whether the references point to the same object,
//        which is exactly what == does.
//        In case you are wondering, the authors of StringBuilder did not implement equals().
//        If you call equals() on two StringBuilder instances, it will check reference equality.
//        You can call toString() on StringBuilder to get a String to check for equality instead.

//        Finally, the exam might try to trick you with a question like this.
//        Can you guess why the code doesn’t compile?
        var name = "a";
        var builder = new StringBuilder("a");

//        System.out.println(name == builder);       // DOES NOT COMPILE

//        Remember that == is checking for object reference equality. The compiler is smart enough to know that two references can’t possibly point to the same object when they are completely different types.

//        DO NOT use equals on StringBuilder
        System.out.println(name.equals(builder));   //because it does not check values for StringBuilder but checks reference

//        convert stringbuilder to string to check for equality
        System.out.println(name.equals(builder.toString()));   //equals does not check values for StringBuilder
    }
}
