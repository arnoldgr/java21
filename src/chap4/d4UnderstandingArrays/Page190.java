package chap4.UnderstandingArrays;

public class Page190 {
    public static void main(String[] args) {
        //        Another way to create an array is to specify all the elements it should start out with.

        int[] moreNumbers = new int[] {42, 55, 99};

//        Java recognizes that this expression is redundant.
//        Since you are specifying the type of the array on the left side of the equals sign,
//        Java already knows the type. And since you are specifying the initial values,
//        it already knows the size. As a shortcut, Java lets you write this:

        int[] moreNumbers2 = {42, 55, 99};

//        This approach is called an anonymous array.
//        It is anonymous because you don’t specify the type and size.
//        Finally, you can type the [] before or after the name,
//        and adding a space is optional.
//        This means that all five of these statements do the exact same thing:

        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];
    }
}
