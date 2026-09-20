import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> file = Files.readAllLines(Paths.get("INPUT.TXT"));
            String[] parts = file.get(0).trim().split("\\s+");

            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);
            long c = Long.parseLong(parts[2]);
            long d = Long.parseLong(parts[3]);

            ArrayList<Integer> roots = new ArrayList<>();

            for (int x = -100; x <= 100; x++) {
                long val = ((a * x + b) * x + c) * x + d;
                if (val == 0) roots.add(x);
            }

            Collections.sort(roots);
            ArrayList<Integer> unique = new ArrayList<>();
            if (!roots.isEmpty()) {
                unique.add(roots.get(0));
                for (int i = 1; i < roots.size(); i++) {
                    if (!roots.get(i).equals(roots.get(i - 1))) {
                        unique.add(roots.get(i));
                    }
                }
            }

            StringBuilder answer = new StringBuilder();
            for (int u : unique) answer.append(u).append(" ");

            System.out.println(answer);
            Files.writeString(Paths.get("OUTPUT.TXT"), answer);

        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }
}