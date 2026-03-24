package chap5.OverloadingMethods.page272;

//Now let’s look at an example that is not valid overloading:
public class Eagle {
    public void fly(int numMiles) {}
//    public int fly(int numMiles) { return 1; }     // DOES NOT COMPILE
}

//This method doesn’t compile because it differs from the original only by return type. The method signatures are the same, so they are duplicate methods as far as Java is concerned.
