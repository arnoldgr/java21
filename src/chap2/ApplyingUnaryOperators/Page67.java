package chap2.ApplyingUnaryOperators;

//Complement and Negation Operators
/*The logical complement operator (!) flips the value of a boolean expression. For example,
if the value is true, it will be converted to false, and vice versa.
To illustrate this, compare the outputs of the following statements:
  */
public class Page67 {
    public static void main(String[] args) {
        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep);  // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep);  // true

        //ext, the bitwise negation operator (~) turns all the zeros into ones and vice versa.
        // You can figure out the new value by negating the original and subtracting one.
        // For example:
        int number = 70;
        int negated = ~number;
        System.out.println(negated);   // -71
        System.out.println(~negated);  // 70

        //Next, the negation operator (-) reverses the sign of a numeric expression, as shown in these statements:
        double zooTemperature = 1.21;
        System.out.println(zooTemperature);  // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);  // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature);  // -1.21

//        Based on the description, it might be obvious that some operators require the variable or expression they’re acting on to be of a specific type. For example, you cannot apply a negation operator (-) to a boolean expression, nor can you apply a logical complement operator (!) to a numeric expression. Be wary of questions on the exam that try to do this, as they cause the code to fail to compile. For example, none of the following lines of code will compile:
//        int pelican = !5;         // DOES NOT COMPILE
//        boolean penguin = -true;  // DOES NOT COMPILE
//        boolean parrot = ~true;   // DOES NOT COMPILE
//        boolean peacock = !0;     // DOES NOT COMPILE
    }
}
