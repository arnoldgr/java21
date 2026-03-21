package chap14.interacting_with_users.page857;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosingSystemStreams {

    public static void main(String[] args) {
        closeSystemOutExample();
        closeSystemErrExample();
        closeSystemInExample();
    }

    static void closeSystemOutExample() {
        try (var out = System.out) {
            // closes System.out
        }

        System.out.println("This will NOT print because System.out is closed.");
    }

    static void closeSystemErrExample() {
        try (var err = System.err) {
            // closes System.err
        }

        System.err.println("This will NOT print because System.err is closed.");
    }

    static void closeSystemInExample() {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        try (reader) {
            // closes reader and System.in wrapper
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String data = reader.readLine(); // will fail
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}