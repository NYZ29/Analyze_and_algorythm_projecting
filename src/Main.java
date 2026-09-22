import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> file = Files.readAllLines(Paths.get("INPUT.TXT"));

            long n = Long.parseLong(file.get(0).trim());
            long min = (n / 6) + (7 - (n % 6)) % 7;
            long max = n * 6;
            String answer = min + " " + max;

            Files.writeString(Paths.get("OUTPUT.TXT"), answer);

        } catch (IOException e) {

        }
    }
}