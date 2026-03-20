// Page302.java
package declaringconstructors;

// Declaring Constructors

public class Page302 {

    String name;

    // Constructor
    public Page302(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Page302 obj = new Page302("Java");

        System.out.println(obj.name);
    }
}

/*
Constructor rules:

- Same name as class
- No return type
- Runs when object is created

this.name = name
→ distinguishes field vs parameter
*/