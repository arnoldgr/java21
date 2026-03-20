package chap2.ComparingValues;

//Relational Operators
public class Page83 {
    public static void main(String[] args) {
//instanceof Operator
//    The final relational operator you need to know for the exam is the instanceof operator.
//    It is useful for determining whether an arbitrary object is a member of a particular
//    class or interface at runtime.


//    For now, all you need to know is objects can be passed around using a variety of references.
//    For example, all classes inherit from java.lang.Object.
//    This means that any instance can be assigned to an Object reference.
//    For example, how many objects are created and used in the following code snippet?

//    How many objects are created and used in the following code snippet?
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

//    In the example above , only one object is created in memory,
//    but there are three different references to it because Integer inherits both Number and Object.
//    This means you can call instanceof on any of these references with three different data types,
//    and it will return true for each of them.

//        instanceof Operator
//        Now, we want the function to add O’clock to the end of output if the value is a whole number type, such as an Integer; otherwise, it just prints the value.

//        calling openZoo with various arguments

        int i = 30;
        short s = 5;
        byte b = 1;

        openZoo(12.30);
        openZoo(12);   //integer
        openZoo(s);
        openZoo(b);
        openZoo(i);         //integer
    }
    static public void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.println((Integer)time + " O'clock");
        else
            System.out.println(time);
//        It is considered a good coding practice to use the instanceof operator prior to casting from
//        one object to a narrower type.
    }
}
