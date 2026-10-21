import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(List.of(5, 7, 7, 8, 8, 10));
        int b1 = 8;

        System.out.println(Solution.searchRange(a1, b1));

        ArrayList<Integer> a2 = new ArrayList<>(List.of(5, 17, 100, 111));
        int b2 = 3;

        System.out.println(Solution.searchRange(a2, b2));
    }
}