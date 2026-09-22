import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> file = Files.readAllLines(Paths.get("INPUT.TXT"));

            String cage = file.get(0).trim();
            char letter = cage.charAt(0);
            int number = cage.charAt(1) - '0';

            String answer = (((letter - 'A') + (number - 1)) % 2 == 0) ? "BLACK" : "WHITE";

            System.out.println(answer);
            Files.writeString(Paths.get("OUTPUT.TXT"), answer);

        } catch (IOException e) {

        }
    }
}