import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> file = Files.readAllLines(Paths.get("INPUT.TXT"));

            String[] numbers = file.get(0).trim().split("\\s+");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            String answer = Integer.toString(NOD(a, b));

            Files.writeString(Paths.get("OUTPUT.TXT"), answer);

        } catch (IOException e) {

        }
    }

    private static int NOD(int a, int b) {
        int min = Math.min(a, b);
        int max = a + b - min;

        while (min > 0 && max > 0) {
            if (max % min == 0) return min;

            int temp = max % min;
            max = min;
            min = temp;
        }

        return 1;
    }
}