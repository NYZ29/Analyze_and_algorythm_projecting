public class Main {
    public static void main(String[] args) throws java.io.IOException {
        String input = java.nio.file.Files.readString(java.nio.file.Paths.get("INPUT.TXT"));
        char[] moves = input.toCharArray();
        int[] thimbles = {1, 0, 0};

        for (char move : moves) {
            if (move == 'A') swap(thimbles, 0, 1);
            else if (move == 'B') swap(thimbles, 1, 2);
            else swap(thimbles, 0, 2);
        }

        String answer = " ";
        for (int i = 0; i < 3; i++) {
            if (thimbles[i] == 1) answer = Integer.toString(i + 1);
        }
        answer.trim();

        java.nio.file.Files.writeString(java.nio.file.Paths.get("OUTPUT.TXT"), answer);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}