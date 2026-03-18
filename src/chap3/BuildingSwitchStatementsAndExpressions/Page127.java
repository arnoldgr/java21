package chap3.BuildingSwitchStatementsAndExpressions;

public class Page127 {
//    You may have noticed that we didn’t use any default clauses in any of our previous pattern
//    matching examples. That’s because we defined our last case clause with a pattern matching
//    variable type that is the same as the switch variable reference type.

//    That might sound complicated, but it’s simpler than it seems. For example,
//    if the variable reference type of the switch expression is type Integer or String,
//    then you just need to make sure the last case clause is of type Integer or String, respectively.

    public static void main(String[] args) {
//        Let’s try an illustrative example. What do you expect the output of the following to be?
        Number zooPatrons = Integer.valueOf(1_000);
//        switch (zooPatrons) {
//            case Integer count -> System.out.print("Welcome: " + count);
//        }

//        It doesn’t compile !Despite the zooPatrons object actually being of type Integer,
//        the switch reference variable
//        is of type Number.There are a few ways that we can fix this.
//        First, we can change the reference type of
//        zooPatrons to be Integer, which results in all possible values of Integer being covered.
        Integer zooPatrons2 = Integer.valueOf(1_000);
        switch (zooPatrons2) {
            case Integer count -> System.out.print("Welcome: " + count);
        }

//        Alternatively, we can also add a case clause at the end for Number.
        Number zooPatrons3 = Integer.valueOf(1_000);
        switch (zooPatrons3) {
            case Integer count -> System.out.print("Welcome: " + count);
            case Number count -> System.out.print("Too many people at the zoo!");
        }

//        There is a third option, too !Don’t forget, we can always add a default clause
//        to a switch that covers everything.
//        That brings us to an interesting question:what if you combine different solutions?
        Number zooPatrons4 = Integer.valueOf(1_000);
        switch (zooPatrons4) {
            case Integer count -> System.out.print("Welcome: " + count);
           // case Number count -> System.out.print("Too many people at the zoo!");
            default -> System.out.print("The zoo is closed");
        }

//        In this case , the code does not compile, regardless of how you order the branches.
//        The compiler is smart enough to realize the last two
//        statements are redundant, as one always dominates the other.
    }
}
