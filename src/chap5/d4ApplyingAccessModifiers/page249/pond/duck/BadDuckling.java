package chap5.ApplyingAccessModifiers.page249.pond.duck;

public class BadDuckling {
    public void makeNoise() {
//        BadDuckling is trying to access an instance variable and a method it has no business touching.
//        On line 13, it tries to access a private method in another class.
//        On line 14, it tries to access a private instance variable in another class.
//        Both generate compiler errors. Bad duckling!
//        Our bad duckling is only a few days old and doesn’t know better yet.
//        Luckily, you know that accessing private members of other classes is not allowed, and you need to use a different type of access.

        var duck = new FatherDuck();
//        duck.quack();                    // DOES NOT COMPILE these are both private
//        System.out.print(duck.noise);    // DOES NOT COMPILE
    }

//    What if they were declared in the same file?
//    Even then, the code would still not compile as Java prevents access outside the class.

}