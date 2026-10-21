import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(List.of(1, 3, 4, 4, 6));
        int b1 = 4;

        System.out.println(Solution.solve(a1, b1));

        ArrayList<Integer> a2 = new ArrayList<>(List.of(1, 2, 5, 5));
        int b2 = 3;

        System.out.println(Solution.solve(a2, b2));
    }
}