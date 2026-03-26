package chap8.c3UsingMethodReferences.page453;

//Calling Constructors
//A constructor reference is a special type of method reference that uses new instead of a method and instantiates an object. For this example, our functional interface will not take any parameters but will return a String.
interface EmptyStringCreator {
    String create();
}


interface StringCopier {
    String copy(String value);
}

//To call this, we use new as if it were a method name.
public class Page453 {
    public static void main(String[] args) {
        String s = "Snake";
        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = String::new;

        var myString = methodRef.create();
        System.out.println(myString.equals("Snake"));  // false

//        It expands like the method references you have seen so far.
//        In the previous example, the lambda doesn’t have any parameters.
//        Method references can be tricky.
//        This time we create a functional interface that takes one parameter and returns a result:

//        In the implementation, notice that line 31 in the following example has the same method reference
//        as line 18 in the previous example:
        StringCopier methodRef2 = String::new;
        StringCopier lambda2 = x -> new String(x);

        var myString2 = methodRef2.copy("Zebra");
        System.out.println(myString2.equals("Zebra"));  // true

//        This means you can’t always determine which method can be called by looking at the method reference. Instead, you have to look at the context to see what parameters are used and if there is a return type. In this example, Java sees that we are passing a String parameter and calls the constructor of String that takes such a parameter.

    }
}

//
//Reviewing Method References
//Reading method references is helpful in understanding the code. Table 8.3 shows the four types of method references. If this table doesn’t make sense, please reread the previous section. It can take a few tries before method references start to add up.
//
