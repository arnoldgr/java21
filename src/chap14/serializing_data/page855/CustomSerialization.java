package chap14.serializing_data.page855;
import java.io.*;

public class CustomSerialization {

    public static void main(String[] args) {
        Fish originalFish = new Fish("Dory", 4);
        File dataFile = new File("src/chap14/serializing_data/fish.ser");

        try {
            saveToFile(originalFish, dataFile);

            Fish fishFromDisk = readFromFile(dataFile);

            System.out.println("Original object before save:");
            System.out.println(originalFish);

            System.out.println("\nDeserialized object:");
            System.out.println(fishFromDisk);

            System.out.println("\nNotice:");
            System.out.println("- name was changed to \"Nemo\" during writeObject()");
            System.out.println("- fins was restored to 10 during readObject()");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void saveToFile(Fish fish, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            out.writeObject(fish);
        }
    }

    static Fish readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {

            Object object = in.readObject();
            if (object instanceof Fish f) {
                return f;
            }
        }

        return null;
    }
}
