// Page320.java
package inheritingmembers;

// Inheriting Members

class Parent {

    protected int value = 10;

    protected void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    public void display() {
        System.out.println(value); // inherited field
        show();                   // inherited method
    }
}

public class Page320 {

    public static void main(String[] args) {

        Child c = new Child();
        c.display();
    }
}

/*
Access levels:

- private → NOT inherited
- protected → inherited (important)
- public → inherited everywhere

Child can use parent's protected members
*/