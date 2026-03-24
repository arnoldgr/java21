package chap6.inheritingmembers.page323;

//Rule #3: Checked Exceptions
//The third rule says that overriding a method cannot declare new checked exceptions or
// checked exceptions broader than the inherited method.
// This is done for polymorphic reasons similar to limiting access modifiers.
// In other words, you could end up with an object that is more restrictive than the
// reference type it is assigned to, resulting in a checked exception that is not handled or declared.
// One implication of this rule is that overridden methods are free to declare any number
// of new unchecked exceptions.

//If you don’t know what a checked or unchecked exception is, don’t worry.
// We cover this in Chapter 11, “Exceptions and Localization.” For now, you just need to know that
// the rule applies only to checked exceptions. It’s also helpful to know that both IOException and
// FileNotFoundException are checked exceptions, and that FileNotFoundException is a subclass of IOException.

import java.io.FileNotFoundException;
import java.io.IOException;//Let’s try an example:

class Reptile {
    protected void sleep() throws IOException {
    }

    protected void hide() {
    }

    protected void exitShell() throws FileNotFoundException {
    }
}

class GalapagosTortoise extends Reptile {
    public void sleep() throws FileNotFoundException {
    }

//    public void hide() throws FileNotFoundException {} // DOES NOT COMPILE


//    public void exitShell() throws IOException {}      // DOES NOT COMPILE
}

//In this example, we have three overridden methods.
// These overridden methods use the more accessible public modifier,
// which is allowed per our second rule for overridden methods.
// The first overridden method sleep() in GalapagosTortoise compiles without issue
// because the declared exception is narrower than the exception declared in the parent class.
//The overridden hide() method does not compile because
// it declares a new checked exception not present in the parent declaration.
// The overridden exitShell() also does not compile, since IOException is a broader checked exception
// than FileNotFoundException. We revisit these exception classes,
// including memorizing which ones are subclasses of each other, in Chapter 11
