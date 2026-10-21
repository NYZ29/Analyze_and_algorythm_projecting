import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(List.of(1,2,1,3,4,3));
        int B1 = 3;

        System.out.println(Solution.dNums(A1, B1));

        ArrayList<Integer> A2 = new ArrayList<>(List.of(1,1,2,2));
        int B2 = 1;

        System.out.println(Solution.dNums(A2, B2));
    }
}