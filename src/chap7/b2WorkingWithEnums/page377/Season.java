package chap7.b2WorkingWithEnums.page377;
//
//Working with Enums
//In programming, it is common to have a type that can only have a finite set of values,
// such as days of the week, seasons of the year, primary colors, and so on. An enumeration, or enum for short, is like a fixed set of constants.
//Using an enum is much better than using a bunch of constants because it provides type-safe checking. With numeric or String constants, you can pass an invalid value and not find out until runtime. With enums, it is impossible to create an invalid enum value without introducing a compiler error.
//Enumerations show up whenever you have a set of items whose types are known at compile time. Common examples include the compass directions, the months of the year, the planets in the solar system, and the cards in a deck (well, maybe not the planets in a solar system, given that Pluto had its planetary status revoked).
//
//Creating Simple Enums
//To create an enum, declare a type with the enum keyword, a name, and a list of values, as shown in Figure 7.4.
//We refer to an enum that only contains a list of values as a simple enum. When working with simple enums, the semicolon at the end of the list is optional. Keep the Season enum handy, as we use it throughout this section.
enum Season {WINTER,SPRING,SUMMER,FALL}

//Enum values are considered constants and are commonly written using snake_case.
// For example, an enum declaring a list of ice cream flavors might include values like
// VANILLA, ROCKY_ROAD, MINT_CHOCOLATE_CHIP, and so on.

//As you can see, enums print the name of the enum when toString() is called.
// They can be compared using == because they are like static final constants.
// In other words, you can use equals() or == to compare enums,
// since each enum value is initialized only once in the Java Virtual Machine (JVM).
//One thing that you can’t do is extend an enum.

//public enum ExtendedSeason extends Season {} // DOES NOT COMPILE

//The values in an enum are fixed.
// You cannot add more by extending the enum nor can you mark an enum final.
// On the other hand, an enum can implement an interface, which we will cover shortly.
