package chap6.inheritingmembers.page325;

//Marking Methods with the @Override Annotation

//An annotation is a metadata tag that provides additional information about your code.
// You can use the @Override annotation to tell the compiler that you are attempting to override a method.

class Fish {
    public void swim() {};
}
class Shark extends Fish {
    @Override
    public void swim() {};
}


//When the method is correctly overridden, adding the annotation doesn’t impact the code.
// On the other hand, when the method is incorrectly overridden, this annotation can prevent you from making a mistake. The following does not compile because of the presence of the @Override annotation:


class Fish2 {
    public void swim() {};
}
class Shark2 extends Fish2 {
//    @Override
    public void swim(int speed) {};  // DOES NOT COMPILE
}


//The compiler sees that you are attempting a method override and looks for an inherited version of swim()
// that takes an int value. Since the compiler doesn’t find one, it reports an error.
// While knowing advanced topics (such as how to create annotations) is not required for the exam,
// knowing how to use them properly is.

