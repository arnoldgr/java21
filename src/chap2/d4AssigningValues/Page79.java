package chap2.AssigningValues;
//Compound assignment operators
public class Page79 {
    public static void main(String[] args) {
        //multiplication example
        int camel = 2, giraffe = 3;
        camel = camel * giraffe;   // Simple assignment operator
        camel *= giraffe;          // Compound assignment operator

//        Can you figure out why the last line does not compile?
        long goat = 10;
        int sheep = 5;
       // sheep = sheep * goat;   // DOES NOT COMPILE

//        From the previous section, you should be able to spot the problem in the last line.
//        We are trying to assign a long value to an int variable.
//        This last line could be fixed with an explicit cast to (int),
//        but there’s a better way using the compound assignment operator:

        sheep *= goat;

//        The compound operator will first cast sheep to a long, apply the multiplication of two long values,
//        and then cast the result to an int. Unlike the previous example,
//        in which the compiler reported an error, the compiler will automatically cast
//        the resulting value to the data type of the value on the left side of the compound operator.



    }
}
