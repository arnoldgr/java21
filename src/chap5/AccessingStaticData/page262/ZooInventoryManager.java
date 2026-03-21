package chap5.AccessingStaticData.page262;

//This can get interesting. Do you think the following compiles?
import java.util.*;
public class ZooInventoryManager {
    private static final String[] treats = new String[10];
    public static void main(String[] args) {
        treats[0] = "popcorn";
    }
}

//It actually does compile since treats is a reference variable.
// We are allowed to modify the referenced object or array’s contents.
// All the compiler can do is check that we don’t try to reassign treats to point to a different object.

