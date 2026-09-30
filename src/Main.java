public class Main {
    public static void main(String[] args) throws java.io.IOException {
        String input = java.nio.file.Files.readString(java.nio.file.Paths.get("INPUT.TXT"));

        int num = Integer.parseInt(input.trim());
        StringBuilder answer = new StringBuilder();

        if (num > 8) answer.append(num - 8).append(" ");
        if (num % 8 != 1) answer.append(num - 1).append(" ");
        if (num % 8 != 0) answer.append(num + 1).append(" ");
        if (num < 57) answer.append(num + 8);

        System.out.println(answer);
        java.nio.file.Files.writeString(java.nio.file.Paths.get("OUTPUT.TXT"), answer);
    }
}