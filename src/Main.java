public class Main {
    public static void main(String[] args) throws java.io.IOException {
        String input = java.nio.file.Files.readString(java.nio.file.Paths.get("INPUT.TXT"));

        int n = Integer.parseInt(input.trim());
        n--;

        java.nio.file.Files.writeString(java.nio.file.Paths.get("OUTPUT.TXT"), Integer.toString(n * n - n));
    }
}