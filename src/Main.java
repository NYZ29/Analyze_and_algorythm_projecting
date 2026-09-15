import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("INPUT.TXT"));

            String[] words = lines.get(0).trim().split(" ");
            int[] numbers = new int[words.length];

            for (int i = 0; i < words.length; i++) {
                numbers[i] = Integer.parseInt(words[i]);
            }

            String answer = (numbers[0] * numbers[1] == numbers[2])
                    ? "YES" : "NO";

            System.out.println(answer);
            Files.writeString(Paths.get("OUTPUT.TXT"), answer);

        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }
}