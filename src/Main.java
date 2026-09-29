import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> input = Files.readAllLines(Paths.get("INPUT.TXT"));
        String[] coordinates = input.get(0).trim().split("\\s+");

        long x1 = Long.parseLong(coordinates[0]);
        long y1 = Long.parseLong(coordinates[1]);
        long x2 = Long.parseLong(coordinates[2]);
        long y2 = Long.parseLong(coordinates[3]);
        long x3 = Long.parseLong(coordinates[4]);
        long y3 = Long.parseLong(coordinates[5]);

        long doubleArea = Math.abs(
                (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1)
        );

        String answer;

        if (doubleArea % 2 == 0) answer = Long.toString(doubleArea / 2);
        else answer = (doubleArea / 2) + ".5";

        System.out.println(answer);
        Files.writeString(Paths.get("OUTPUT.TXT"), answer);
    }
}