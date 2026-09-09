public class Main {
    public static int countDigits(int num) {
        int num_copy = num;
        int count = 0;

        while (num_copy > 0) {
            int digit = num_copy % 10;
            if (digit == 0) return 0;
            if (num % digit == 0) count++;
            num_copy /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println();

        for (String arg : args) {
            int num = Integer.parseInt(arg);

            System.out.println(countDigits(num));
        }
    }
}