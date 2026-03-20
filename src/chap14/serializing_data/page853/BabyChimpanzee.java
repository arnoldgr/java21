package chap14.serializing_data.page853;

public class BabyChimpanzee extends Chimpanzee {

    private static final long serialVersionUID = 3L;

    private String mother = "Mom";

    public BabyChimpanzee() {
        super();
    }

    public BabyChimpanzee(String name, char type) {
        super(name, 0, type);
    }

    @Override
    public String toString() {
        return super.toString() + ", mother=" + mother;
    }
}
