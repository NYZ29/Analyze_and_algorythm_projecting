import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("input.txt"));

            String[] words = lines.getFirst().split(" ");
            int[] numbers = new int[words.length];

            for (int i = 0; i < words.length; i++) {
                numbers[i] = Integer.parseInt(words[i]);
            }

            int sum = 0;
            for (int num : numbers) sum += num;

            Files.writeString(Paths.get("output.txt"), Integer.toString(sum));
        } catch (IOException e) {
            System.err.println("Файл не открылся");
        }
    }
}
