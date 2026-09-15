import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("INPUT.TXT"));

            String line = lines.get(0);
            int digit = Integer.parseInt(line.trim());
            int number = digit * 100 + 90 + (9 - digit);

            System.out.println(number);
            Files.writeString(Paths.get("OUTPUT.TXT"), Integer.toString(number) + "\n");

        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
        }
    }
}