import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> file = Files.readAllLines(Paths.get("INPUT.TXT"));

            String[] start = file.get(0).trim().split("\\s*:");
            String[] period = file.get(1).trim().split("\\s+");

            int endMinute = Integer.parseInt(start[1]) + Integer.parseInt(period[1]);
            int endHour = (Integer.parseInt(start[0]) + Integer.parseInt(period[0]) + (endMinute / 60)) % 24;
            endMinute %= 60;

            StringBuilder end = new StringBuilder();

            if (endHour < 10) end.append(0).append(endHour);
            else end.append(endHour);
            end.append(":");

            if (endMinute < 10) end.append(0).append(endMinute);
            else end.append(endMinute);

            System.out.println(end);
            Files.writeString(Paths.get("OUTPUT.TXT"), end);

        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }
}