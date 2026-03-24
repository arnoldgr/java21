package chap7.c3SealingClasses.page385;

//Sealing Interfaces
//Besides classes, interfaces can also be sealed.
// The idea is analogous to classes, and many of the same rules apply.
// For example, the sealed interface must appear in the same package or named
// module as the classes or interfaces that directly extend or implement it.
//One distinct feature of a sealed interface is that the permits list can apply to a
// class that implements the interface or an interface that extends the interface.

//Sealed interface
sealed interface Swims permits Duck, Swan, Floats {
}

// Classes permitted to implement sealed interface
final class Duck implements Swims {
}

final class Swan implements Swims {
}

// Interface permitted to extend sealed interface
non-sealed interface Floats extends Swims {
}

// What modifiers are permitted for interfaces that extend a sealed interface?
// Well, remember that interfaces are implicitly abstract and cannot be marked final.
// For this reason, interfaces that extend a sealed interface can only be marked sealed or non-sealed.
// They cannot be marked final.

