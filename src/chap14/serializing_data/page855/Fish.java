package chap14.serializing_data.page855;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Fish implements Serializable {

    private static final long serialVersionUID = 4L;

    private String name;
    private transient int fins;

    public Fish(String name, int fins) {
        this.name = name;
        this.fins = fins;
    }

    public String getName() {
        return name;
    }

    public int getFins() {
        return fins;
    }

    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();

        // custom logic after default deserialization
        this.fins = 10;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        // custom logic before default serialization
        this.name = "Nemo";

        out.defaultWriteObject();
    }

    @Override
    public String toString() {
        return "[name=" + name + ", fins=" + fins + "]";
    }
}
