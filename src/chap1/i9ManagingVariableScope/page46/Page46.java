package chap1.i9ManagingVariableScope.page46;

public class Page46 {
    //   See if you can figure out on which line each of the five local variables goes into and out of scope.
    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}
/*Now that we know where the blocks are, we can look at the scope of each variable.
hungry and amountOfFood are method parameters, so they are available for the entire method.
This means their scope is lines 11 to 22. The variable roomInBelly goes into scope on line 12
because that is where it is declared. It stays in scope for the rest of the method and goes
out of scope on line 22. The variable timeToEat goes into scope on line 14 where it is declared.
It goes out of scope on line 20 where the if block ends. Finally, the variable amountEaten
goes into scope on line 16 where it is declared. It goes out of scope on line 19 where the
while block ends.

 */