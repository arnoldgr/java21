package chap6.declaringconstructors.page304;

//For the exam, one of the most important rules you need to know is that the compiler only inserts the default constructor when no constructors are defined. Which of these classes do you think has a default constructor?
public class Rabbit3 {}

class Rabbit4 {
    public Rabbit4() {}
}

class Rabbit5 {
    public Rabbit5(boolean b) {}
}

class Rabbit6 {
    private Rabbit6() {}
}

//Only Rabbit3 gets a default no-argument constructor.
// It doesn’t have a constructor coded, so Java generates a default no-argument constructor.
// Rabbit4 and Rabbit3 both have public constructors already.
// Rabbit6 has a private constructor. Since these three classes have a constructor defined,
// the default no-argument constructor is not inserted for you.
