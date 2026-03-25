package chap8.a1WritingSimpleLambdas.page444;


//LAMBDAS RETURNING BOOLEAN

//() -> true
//X  -> x.startsWith("test")
//(String x) -> x.startsWith("test")
//(x, y) -> { return x.startsWith("test");
//(String x, String y) -> x.startsWith("test")

//INVALID LAMBDAS
// x, y -> x.startsWith("fish")
// x -> { x.startsWith("camel"); }
// x -> { return x.startsWith("giraffe")}
// String x -> x.endsWith("eagle")
//}

//    Remember that the parentheses are optional only when there is one parameter
//    and it doesn’t have a type declared. Those are the basics of writing a lambda.
//    At the end of the chapter, we cover additional rules about using variables in a lambda.

//    Assigning Lambdas to var
//
//    Why do you think this line of code doesn’t compile?


//    var invalid = (Animal a) -> a.canHop();  // DOES NOT COMPILE


//    Remember when we talked about Java inferring information about the lambda from the context? Well, var assumes the type based on the context as well. There’s not enough context here! Neither the lambda nor var have enough information to determine what type of functional interface should be used.
