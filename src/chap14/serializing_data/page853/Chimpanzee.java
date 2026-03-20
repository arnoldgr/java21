package chap14.serializing_data.page853;
import java.io.Serializable;

public class Chimpanzee extends Mammal implements Serializable {

    private static final long serialVersionUID = 2L;

    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    {
        this.age = 14;
    }

    public Chimpanzee() {
        this("Unknown", 12, 'Q');
    }

    public Chimpanzee(String name, int age, char type) {
        this.name = name;
        this.age = age;
        Chimpanzee.type = type;
        setId(9);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static char getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[name=" + name +
                ", age=" + age +
                ", type=" + type +
                ", id=" + getId() + "]";
    }
}