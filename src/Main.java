import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> file = Files.readAllLines(Paths.get("INPUT.TXT"));

        int n = Integer.parseInt(file.get(0).trim());
        int[][] residents = new int[n][2];
        int maxAge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String[] ageAndGender = file.get(i + 1).trim().split("\\s+");
            residents[i][0] = Integer.parseInt(ageAndGender[0]);
            residents[i][1] = Integer.parseInt(ageAndGender[1]);

            if (residents[i][1] == 1) {
                maxAge = Math.max(maxAge, residents[i][0]);
            }
        }

        String answer = "-1";

        for (int i = 0; i < n; i++) {
            if (residents[i][1] == 1 && residents[i][0] == maxAge) {
                answer = Integer.toString(i + 1);
                break;
            }
        }

        System.out.println(answer);
        Files.writeString(Paths.get("OUTPUT.TXT"), answer);
    }
}