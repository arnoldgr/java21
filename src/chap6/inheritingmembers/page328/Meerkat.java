package chap6.inheritingmembers.page328;

//Hiding Variables
//As you saw with method overriding, there are lots of rules when two methods have the same
// signature and are defined in both the parent and child classes.
// Luckily, the rules for variables with the same name in the parent and child classes are much simpler.
// In fact, Java doesn’t allow variables to be overridden. Variables can be hidden, though.
//A hidden variable occurs when a child class defines a variable with the same name as an
// inherited variable defined in the parent class.
// This creates two distinct copies of the variable within an instance of the child class:
// one instance defined in the parent class and one defined in the child class.
//As when hiding a static method, you can’t override a variable; you can only hide it. Let’s take a look at a hidden variable. What do you think the following application prints?
class Carnivore {
    protected boolean hasFur = false;
}

public class Meerkat extends Carnivore {
    protected boolean hasFur = true;

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivore c = m;
        System.out.println(m.hasFur);  // true
        System.out.println(c.hasFur);  // false
    }
}


//Confused about the output? Both of these classes define a hasFur variable,
// but with different values.
// Even though only one object is created by the main() method, both variables exist independently of each other.
// The output changes depending on the reference variable used.
//If you didn’t understand the last example, don’t worry.
// We cover polymorphism in more detail in the next chapter.
// For now, you just need to know that overriding a method replaces the parent method on
// all reference variables (other than super), whereas hiding a method or variable replaces the member
// only if a child reference type is used.
