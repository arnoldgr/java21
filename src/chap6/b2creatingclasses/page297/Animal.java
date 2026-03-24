package chap6.creatingclasses.page297;

//Let’s create two files in the same package, Animal.java and Lion.java.
// Animal.java
public class Animal {
    private int age;
    protected String name;
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
}

