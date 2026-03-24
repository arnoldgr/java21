package chap5.DeclaringLocalAndInstanceVariables.page242;

//Declaring Local and Instance Variables
//Now that we have methods, we need to talk a little bit about the variables
// that they can create or use. As you might recall from Chapter 1, local variables
// are those defined within a method or block, while instance variables are those
// that are defined as a member of a class.
// Let’s take a look at an example:
public class Lion {
    int hunger = 4;

    public int feedZooAnimals() {
        int snack = 10;  // Local variable
        if(snack> 4) {
            long dinnerTime = snack++;
            hunger--;
        }
        return snack;
    }
}
//In the Lion class, snack and dinnertime are local variables accessible only within their respective code blocks,
// while hunger is an instance variable and created in every object of the Lion class.
//The object or value returned by a method may be available outside the method,
// but the variable reference snack is gone. Keep this in mind while reading this chapter:
// all local variable references are destroyed after the block is executed,
// but the objects they point to may still be accessible.

