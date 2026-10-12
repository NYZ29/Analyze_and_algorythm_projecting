import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        String input = java.nio.file.Files.readString(java.nio.file.Paths.get("INPUT.TXT")).trim();
        String answer = "";

        Pattern pattern1 = Pattern.compile("[A-H][1-8]-[A-H][1-8]");
        Matcher matcher1 = pattern1.matcher(input);

        if (!matcher1.matches()) answer = "ERROR";
        else {
            int diffLetter = Math.abs(input.charAt(0) - input.charAt(3));
            int diffNumber = Math.abs(input.charAt(1) - input.charAt(4));

            if ((diffLetter == 1 && diffNumber == 2) || (diffLetter == 2 && diffNumber == 1)) answer = "YES";
            else answer = "NO";
        }

        java.nio.file.Files.writeString(java.nio.file.Paths.get("OUTPUT.TXT"), answer);
    }
}