package chap7.b2WorkingWithEnums.page379;

import java.sql.SQLOutput;

public class Page379 {
    public static void main(String[] args) {
//Writing Enum Methods
//Like a class, an enum can contain static and instance methods.
// An enum can even implement an interface as we saw earlier of our SeasonWithVisitors enum.
// We include the @Override annotation on line 31 to make it clear it is an inherited method.
//How do we call an enum instance method? That’s easy, too: we just use the enum value followed by the method call.
        SeasonWithVisitors.SUMMER.printVisitors();
        System.out.println(SeasonWithTimes.WINTER.getHours());



//Sometimes you want to define different methods for each enum. For example, our zoo has different seasonal hours.
// It is cold and gets dark early in the winter. We can keep track of the hours through instance variables,
// or we can let each enum value manage hours itself.

    }

}

enum SeasonWithTimes {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SPRING {
        public String getHours() {
            return "9am-5pm";
        }
    },
    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },
    FALL {
        public String getHours() {
            return "9am-5pm";
        }
    };

    public abstract String getHours();
}

//What’s going on here? It looks like we created an abstract class and a bunch of tiny subclasses.
// In a way, we are. The enum itself has an abstract method. This means that each and every enum value is required to
// implement this method. If we forget to implement the method for one of the values, we get a compiler error:
//The enum constant WINTER must implement the abstract method getHours()

//But what if we don’t want each and every enum value to have a method?
// No problem. We can create an implementation for all values and override it only for the special cases.
//enum SeasonWithTimes {
//    WINTER {
//        public String getHours() { return "10am-3pm"; }
//    },
//    SUMMER {
//        public String getHours() { return "9am-7pm"; }
//    },
//    SPRING, FALL;
//    public String getHours() { return "9am-5pm"; }
//}

//This looks better. We only code the special cases and let the others use the enum-provided implementation.

//Just because an enum can have lots of methods doesn’t mean that it should.
// Try to keep your enums simple. If your enum is more than a screen length or two, it is probably too long.
// When enums get too long or too complex, they are difficult to read.

