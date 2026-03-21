package chap5.AccessingStaticData.page260c;

//The exam creators like this topic—a lot. A static method or instance method can call a
// static method because static methods don’t require an object to use.
// Only an instance method can call another instance method on the same class
// ithout using a reference variable, because instance methods do require an object.
// Similar logic applies for instance and static variables.
//Suppose we have a Giraffe class:
public class Giraffe {
    public void eat(Giraffe g) {
        allGiraffeComeOut();
        g.drink();
        eat(g);
    }

    public void drink() {
    }

    ;

    public static void allGiraffeGoHome(Giraffe g) {
        Giraffe g2 = new Giraffe();
        allGiraffeComeOut();
//        drink();  // static methoD cannot call instance method without an instance
        g.eat(g2);
    }

    public static void allGiraffeComeOut() {
    }

    public static void main(String[] args) {

    }
}

//Make sure you understand this




