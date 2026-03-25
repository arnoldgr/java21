package chap7.e5NestedClasses.page400;

// Creating Nested Classes
// A nested class is a class that is defined within another class.
// A nested class can come in one of four flavors,
// with all supporting instance and static variables as members.
//
// Inner class: A non-static type defined at the member level of a class
// Static nested class: A static type defined at the member level of a class
// Local class: A class defined within a method body
// Anonymous class: A special case of a local class that does not have a name
//
// There are many benefits of using nested classes. They can define helper classes and
// restrict them to the containing class, thereby improving encapsulation.
// They can make it easy to create a class that will be used in only one place.
// They can even make the code cleaner and easier to read.
// When used improperly, though, nested classes can sometimes make the code harder to read.
// They also tend to tightly couple the enclosing and inner class, but there may be cases
// where you want to use the inner class by itself.
// In this case, you should move the inner class out into a separate top-level class.
// Unfortunately, the exam tests edge cases where programmers wouldn’t typically use a nested class.
// This tends to create code that is difficult to read, so please never do this in practice!

//By convention and throughout this chapter, we often use the term nested class to refer to all nested types,
// including nested interfaces, enums, records, and annotations.
// You might even come across literature that refers to all of them as inner classes.
// We agree that this can be confusing!

//Declaring an Inner Class
//An inner class, also called a member inner class, is a non-static type defined at the member level of a class
// (the same level as the methods, instance variables, and constructors). Because they are not top-level types, they can use any of the four access levels, not just public and package access.
//Inner classes have the following properties:

//Can be declared public, protected, package, or private
//Can extend a class and implement interfaces
//        Can be marked abstract or final
//Can access members of the outer class, including private members

//The last property is pretty cool.
// It means that the inner class can access variables in the outer class without doing anything special.
// Ready for a complicated way to print Hi three times?

public class Home {
    private String greeting = "Hi";  // Outer class instance variable

    protected class Room {           // Inner class declaration
        public int repeat = 3;

        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }

        private static void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() {        // Instance method in outer class
        var room = new Room();        // Create the inner class instance
        room.enter();
    }

    public static void main(String[] args) {
        var home = new Home();        // Create the outer class instance
        home.enterRoom();
//        There is another way to instantiate Room that looks odd at first.
//        OK, well, maybe not just at first.
//        This syntax isn’t used often enough to get used to it:
//        Room room = home.new Room();  // Create the inner class instance
//        room.enter();  // the enterRoom method won't be needed anymore
    }
}

//An inner class declaration looks just like a stand-alone class declaration except
// that it happens to be located inside another class.
// Line 50 shows that the inner class just refers to greeting as if it were available in the Room class.
// This works because it is, in fact, available. Even though the variable is private,
// it is accessed within that same class.
// Since an inner class is not static, it has to be called using an instance of the outer class.
// That means you have to create two objects. Line 64 creates the outer Home object,
// while line 59 creates the inner Room object.
// It’s important to notice that line 64 doesn’t require an explicit instance of Home
// because it is an instance method within Home.
// This works because enterRoom() is an instance method within the Home class.
// Both Room and enterRoom() are members of Home.

//Creating .class Files for Inner Classes
//Compiling the Home.java class with which we have been working creates two class files.
// You should be expecting the Home.class file. For the inner class, the compiler creates Home$Room.class.
// You don’t need to know this syntax for the exam.
// We mention it so that you aren’t surprised to see files with $ appearing in your directories.
// You do need to understand that multiple class files are created from a single .java file.


