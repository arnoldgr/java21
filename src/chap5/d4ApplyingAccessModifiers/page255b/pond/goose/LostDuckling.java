package chap5.d4ApplyingAccessModifiers.page255b.pond.goose;

import chap5.d4ApplyingAccessModifiers.page255b.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim();                                  // allowed
        System.out.print("Thanks " + teacher.name);       // allowed
    }
}

//LostDuckling is able to refer to swim() and name on DuckTeacher because they are public.
// The story has a happy ending. LostDuckling has learned to swim and can find
// its parents—all because DuckTeacher made members public.
