package chap9.i9WorkingWithGenerics.page534;

class Robot {
}

//Creating a Generic Record
//Generics can also be used with records. This record takes a single generic type parameter:
record CrateRecord<T>(T contents) {
    @Override
    public T contents() {
        if (contents == null)
            throw new IllegalStateException("missing contents");
        return contents;
    }
}

public class Page534 {
    public static void main(String[] args) {
        //This works the same way as classes. You can create a record of the robot!
        Robot robot = null;
        CrateRecord<Robot> record = new CrateRecord<>(robot);
        System.out.println(record.contents());
//This is convenient. Now we have an immutable, generic record!
    }
}


