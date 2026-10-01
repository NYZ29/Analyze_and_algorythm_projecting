public class Main {
    public static void main(String[] args) throws java.io.IOException {
        String input = java.nio.file.Files.readString(java.nio.file.Paths.get("INPUT.TXT"));
        String[] legs = input.trim().split("\\s+");
        int a = Integer.parseInt(legs[0]);
        int b = Integer.parseInt(legs[1]);

        int minLegs = Math.min(a, b);
        int maxLegs = a + b - minLegs;

        int minBird = (maxLegs + 1) / 2;
        int maxBird = minLegs;

        java.nio.file.Files.writeString(java.nio.file.Paths.get("OUTPUT.TXT"), (minBird + " " + maxBird));
    }
}