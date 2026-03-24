package chap7.d4EncapsulatingDataWithRecords.page396;

import java.util.List;

//Nesting Record Patterns
//If a record includes other record values as members, then you can optionally pattern
// match the fields within the record.
// Ready to see how this works?
// Let’s start with two records.
record Bear(String name, List<String> favoriteThings) {
}

record Couple(Bear a, Bear b) {
}


public class Page396 {
    public static void main(String[] args) {
//        Now, let’s say we define a Couple instance within a method.
        var c = new Couple(new Bear("Yogi", List.of("PicnicBaskets")),
                new Bear("Fozzie", List.of("BadJokes")));

//        Which of the following pattern matching statements compile?

        if (c instanceof Couple(Bear a, Bear b)) {
            System.out.print(a.name() + " " + b.name());
        }
        if (c instanceof Couple(
                Bear(String firstName, List<String> f),
                Bear b
        )) {
            System.out.print(firstName + " " + b.name());
        }
//        if (c instanceof Couple(
//                Bear(String name, List<String> f1),
//                Bear(String name, List<String> f2)
//        )) {
//            System.out.print(name + " " + name);
//        }

//        The first pattern matching statement compiles and uses Couple without expanding the nested Bear records.
//        The second example expands the first Bear record, making firstName and b local variables
//        within the pattern matching statement. The third pattern matching statement does not compile.
//        Although you can expand both records, you have to give them distinct names.
//        We can fix this, though, by expanding the nested types to have unique names.
        if (c instanceof Couple(
                Bear(String name1, List<String> f1),
                Bear(String name2, List<String> f2)
        )) {
            System.out.print(name1 + " " + name2);
        }


    }
}

