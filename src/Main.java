import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> file = Files.readAllLines(Paths.get("INPUT.TXT"));

        int n = Integer.parseInt(file.get(0).trim());
        String[] daysString = file.get(1).trim().split("\\s+");
        ArrayList<Integer> oddDays = new ArrayList<>();
        ArrayList<Integer> evenDays = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int day = Integer.parseInt(daysString[i]);

            if (day % 2 == 0) evenDays.add(day);
            else oddDays.add(day);
        }

        StringBuilder answer = new StringBuilder();

        for (int day : oddDays) {
            answer.append(day).append(" ");
        }
        answer.append("\n");

        for (int day : evenDays) {
            answer.append(day).append(" ");
        }
        answer.append("\n");

        String yesORno = (evenDays.size() >= oddDays.size()) ? "YES" : "NO";
        answer.append(yesORno);

        System.out.println(answer);
        Files.writeString(Paths.get("OUTPUT.TXT"), answer);
    }
}