package chap14.serializing_data.page853;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//This is the runnable class that demonstrates the deserialization rules.
public class ChimpanzeeSerialization {

    public static void main(String[] args) {
        var chimpanzees = List.of(
                new Chimpanzee("Ham", 2, 'A'),
                new Chimpanzee("Enos", 3, 'B')
        );

        File dataFile = new File("src/chap14/serializing_data/chimpanzee.ser");

        try {
            System.out.println("Original:   " + chimpanzees);

            saveToFile(chimpanzees, dataFile);

            var chimpanzeesFromDisk = readFromFile(dataFile);

            System.out.println("From Disk:  " + chimpanzeesFromDisk);

            System.out.println("\nImportant notes:");
            System.out.println("- transient fields (name, age) are not saved");
            System.out.println("- static fields are not serialized");
            System.out.println("- Chimpanzee constructors and instance initializers are NOT called during deserialization");
            System.out.println("- Mammal constructor IS called because Mammal is the first non-serializable parent");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void saveToFile(List<Chimpanzee> chimpanzees, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {

            for (Chimpanzee chimpanzee : chimpanzees) {
                out.writeObject(chimpanzee);
            }
        }
    }

    static List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();

        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {

            while (true) {
                Object object = in.readObject();
                if (object instanceof Chimpanzee c) {
                    chimpanzees.add(c);
                }
            }

        } catch (EOFException e) {
            // End of file reached
        }

        return chimpanzees;
    }
}
