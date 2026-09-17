import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("INPUT.TXT"));

            int k = Integer.parseInt(lines.get(0).trim());
            String[] weights = lines.get(1).trim().split("\\s+");

            int minWeight = Integer.MAX_VALUE;
            int maxWeight = 0;
            for (String w : weights) {
                int weight = Integer.parseInt(w);
                if (minWeight > weight) minWeight = weight;
                if (maxWeight < weight) maxWeight = weight;
            }

            StringBuilder answer = new StringBuilder().append(minWeight).append(" ").append(maxWeight);

            System.out.println(answer);
            Files.writeString(Paths.get("OUTPUT.TXT"), answer);

        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }
}