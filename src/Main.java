import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("INPUT.TXT"));

            String str = lines.get(0).trim();
            int maxLen = 0;
            int curLen = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '0') {
                    curLen++;
                    if (maxLen < curLen) maxLen = curLen;
                }
                else curLen = 0;
            }

            System.out.println(maxLen);
            Files.writeString(Paths.get("OUTPUT.TXT"), Integer.toString(maxLen));

        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
            e.printStackTrace();
        }
    }
}