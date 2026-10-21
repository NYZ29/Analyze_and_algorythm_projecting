import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(List.of(2,3));
        int b1 = 3;

        System.out.println(Solution.solve(a1, b1));

        ArrayList<Integer> a2 = new ArrayList<>(List.of(1,4));
        int b2 = 2;

        System.out.println(Solution.solve(a2, b2));
    }
}