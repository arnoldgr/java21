package chap4.UnderstandingEquality;

public class Page187 {
    public static void main(String[] args) {
//        The String Pool
//        Since strings are everywhere in Java, they use up a lot of memory.
//        In some production applications, they can use a large amount of memory in the entire program.
//        Java realizes that many strings repeat in the program and solves this issue by reusing common ones.
//        The string pool, also known as the intern pool, is a location in the Java Virtual Machine (JVM) that collects all these strings.
//        The string pool contains literal values and constants that appear in your program.
//        For example, "name" is a literal and therefore goes into the string pool.
//        The myObject.toString() method returns a string but not a literal, so it does not go into the string pool.
//        Let’s now visit the more complex and confusing scenario,
//        String equality, made so in part because of the way the JVM reuses String literals.
        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y);    // true

//        Remember that a String is immutable and literals are pooled.
//        The JVM created only one literal in memory.
//        The x and y variables both point to the same location in memory; therefore, the statement outputs true.
//        It gets even trickier.
//
//        Consider this code:
        var x2 = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x2 == z); // false

//        In this example, we don’t have two of the same String literal.
//        Although x and z happen to evaluate to the same string, one is computed at runtime.
//        Since it isn’t the same at compile time, a new String object is created.

//        Let’s try another one. What do you think is output here?
        var singleString = "hello world";
        var concat = "hello ";
        concat += "world";
        System.out.println(singleString == concat); // false

//        This prints false. Calling += is just like calling a method and results in a new String.

//        You can even force the issue by creating a new String:
        var x3 = "Hello World";
        var y3 = new String("Hello World");
        System.out.println(x3 == y3); // false

//        The first says to use the string pool normally.
//        The second says, “No, JVM, I really don’t want you to use the string pool.
//        Please create a new object for me even though it is less efficient.”
//        You can also do the opposite and tell Java to use the string pool.
//        The intern() method will use an object in the string pool if one is present.
//        public String intern()

//        If the literal is not yet in the string pool, Java will add it at this time.
        var name = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(name == name2);     // true

//        First we tell Java to use the string pool normally for name.
//        Then,for name2, we tell Java to create a new object
//        using the constructor but to intern it and use the string pool
//        anyway.
//        Since both variables point to the same reference in the string pool,
//        we can use the == operator.

//        Let’s try another one.What do you think this prints out?Be careful.It is tricky.
        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());


//        On line 66, we have a compile - time constant that automatically gets placed in the string pool as "rat1".
//        On line 67, we have a more complicated expression that is also a compile -time constant.Therefore, first and second
//        share the same string pool reference.This makes lines 69 and 70 print true.
//        On line 68, we have a String constructor.This means we no longer have a compile -time constant, and
//        third does not point to a reference in the string pool.
//        Therefore, line 71 prints false.
//        On line 72, the intern() call looks in the string pool.
//        Java notices that first points to the same String and prints true.


//        Remember to never use intern () or == to compare String objects in your code.You should use the equals()
//        method instead.The only time you should have to deal with these is on the exam.

    }
}
