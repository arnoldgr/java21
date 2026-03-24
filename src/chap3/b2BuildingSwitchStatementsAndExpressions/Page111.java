package chap3.BuildingSwitchStatementsAndExpressions;

//introducing switch
public class Page111 {
    public static void main(String[] args) {
        int type = 4;
        //calling a method using an if else statement
        getAnimalBad(type);
        //calling a method using a switch statement does not need to return a value
        getAnimalBetter(type);
        //calling a method using a switch expression / must return a value
        getAnimalBest(type);
    }

    static String getAnimalBad(int type) {
        String animal;
        if (type == 0)
            animal = "Lion";
        else if (type == 1)
            animal = "Elephant";
        else if (type == 2 || type == 3)
            animal = "Alligator";
        else if (type == 4)
            animal = "Crane";
        else
            animal = "Unknown";
        return animal;
    }

    static String getAnimalBetter(int type) {
        String animal;
        switch (type) {
            case 0:
                animal = "Lion";
                break;
            case 1:
                animal = "Elephant";
                break;
            case 2, 3:
                animal = "Alligator";
                break;
            case 4:
                animal = "Crane";
                break;
            default:
                animal = "Unknown";
        }
        return animal;
    }

    static String getAnimalBest(int type) {
        return switch (type) {
            case 0 -> "Lion";
            case 1 -> "Elephant";
            case 2, 3 -> "Alligator";
            case 4 -> "Crane";
            default -> "Unknown";
        };
    }
}
