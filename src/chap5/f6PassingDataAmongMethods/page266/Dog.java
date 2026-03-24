package chap5.f6PassingDataAmongMethods.page266;

//Passing Objects
//Now that you’ve seen primitives, let’s try an example with a reference type.
// What do you think is output by the following code?
public class Dog {
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name);

//The correct answer is Webby. Just as in the primitive example,
// the variable assignment is only to the method parameter and doesn’t affect the caller.
//Notice how we keep talking about variable assignments.
// This is because we can call methods on the parameters.

//        As an example, here is code that calls a method on the StringBuilder passed into the method:

        var name2 = new StringBuilder("Webby");
        speak2(name2);
        System.out.println(name2);   // WebbyGeorgette
//        In this case, speak() calls a method on the parameter.
//        It doesn’t reassign s to a different object.
//        The variable s is a copy of the variable name.
//        Both point to the same StringBuilder,
//        which means that changes made to the StringBuilder are available to both references.

    }


    public static void speak(String name) {
        name = "Georgette";
    }

    public static void speak2(StringBuilder s) {
        s.append("Georgette");
    }
}


