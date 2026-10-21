import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(List.of(12, 34, 67, 90));
        int b1 = 2;

        System.out.println(Solution.books(a1, b1));

        ArrayList<Integer> a2 = new ArrayList<>(List.of(73, 58, 30, 72, 44, 78, 23, 9));
        int b2 = 5;

        System.out.println(Solution.books(a2, b2));
    }
}