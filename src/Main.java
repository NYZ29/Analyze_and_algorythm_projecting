import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("INPUT.TXT"));

            int k = Integer.parseInt(lines.get(0).trim());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < k; i++) {
                String[] part = lines.get(i + 1).trim().split("\\s+");
                int n = Integer.parseInt(part[0]);
                int m = Integer.parseInt(part[1]);

                int d = formula(n, m);

                sb.append(d).append('\n');
            }

            System.out.println(sb);
            Files.writeString(Paths.get("OUTPUT.TXT"), sb);

        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static int formula(int n, int m) {
        return (19 * m + (n + 239) * (n + 366) / 2);
    }
}