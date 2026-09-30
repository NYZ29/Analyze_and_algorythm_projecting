import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> input = Files.readAllLines(Paths.get("INPUT.TXT"));
        int n = Integer.parseInt(input.get(0).trim());
        String[] numbersString = input.get(1).trim().split("\\s+");
        int[] numbers = new int[n];
        int m = Integer.parseInt(input.get(2).trim());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++)
            numbers[i] = Integer.parseInt(numbersString[i]);

        for (int i = 0; i < m; i++) {
            String[] startAndEndString = input.get(i + 3).trim().split("\\s+");
            int start = Integer.parseInt(startAndEndString[0]);
            int end = Integer.parseInt(startAndEndString[1]);

            for (int j = start - 1; j < end; j++) {
                answer.append(numbers[j]).append(" ");
            }
            answer.append("\n");
        }

        System.out.println(answer);
        Files.writeString(Paths.get("OUTPUT.TXT"), answer);
    }
}