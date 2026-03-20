package chap5.DesigningMethods.page241;

//A method signature, composed of the method name and parameter list,
// is what Java uses to uniquely determine exactly which method you are attempting
// to call.
// Once it determines which method you are trying to call, it then determines if the call is allowed.
// For example, attempting to access a private method outside the class or
// assigning the return value of a void method to an int variable results in compiler errors.
// Neither of these compiler errors is related to the method signature, though.
//It’s important to note that the names of the parameters in the method signature
// are not used as part of a method signature. The parameter list is about the types of parameters and their order. For example, the following two methods have the exact same signature:


// DOES NOT COMPILE
public class Trip {
//    public void visitZoo(String name, int waitTime) {}
    public void visitZoo(String attraction, int rainFall) {}

}//Despite having different parameter names, these two methods have the same signature
// and cannot be declared within the same class.
//
// Changing the order of parameter types does allow the method to compile, though:
class Trip2 {
    public void visitZoo(String name, int waitTime) {}
    public void visitZoo(int rainFall, String attraction) {}
}

//We cover these rules in more detail when we get to method overloading later in this chapter.
