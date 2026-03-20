package chap14.serializing_data.page849;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

//This is the main runnable class for the Gorilla example.
public class SerializationExample {

    public static void main(String[] args) {
        var gorillas = new ArrayList<Gorilla>();
        gorillas.add(new Gorilla("Grodd", 5, false, "Bananas"));
        gorillas.add(new Gorilla("Ishmael", 8, true, "Mangoes"));

        File dataFile = new File("src/chap14/serializing_data/gorilla.ser");

        try {
            saveToFile(gorillas, dataFile);

            var gorillasFromDisk = readFromFile(dataFile);

            System.out.println("Original Objects:");
            System.out.println(gorillas);

            System.out.println("\nDeserialized Objects:");
            System.out.println(gorillasFromDisk);

            System.out.println("\nNotice: favoriteFood is transient, so it becomes null after deserialization.");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {

            for (Gorilla gorilla : gorillas) {
                out.writeObject(gorilla);
            }
        }
    }

    static List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();

        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {

            while (true) {
                Object object = in.readObject();
                if (object instanceof Gorilla g) {
                    gorillas.add(g);
                }
            }

        } catch (EOFException e) {
            // End of file reached
        }

        return gorillas;
    }
}