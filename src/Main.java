import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(List.of(3, 9, 10, 20, 17, 5, 1));
        int b1 = 20;

        System.out.println(Solution.solve(a1, b1));

        ArrayList<Integer> a2 = new ArrayList<>(List.of(5, 6, 7, 8, 9, 10, 3, 2, 1));
        int b2 = 30;

        System.out.println(Solution.solve(a2, b2));

        ArrayList<Integer> a3 = new ArrayList<>(List.of( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11));
        int b3 = 12;

        System.out.println(Solution.solve(a3, b3));
    }
}