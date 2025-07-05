import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int total = sum(new ArrayList<>(Arrays.asList(2, 4, 6)), 0);
        System.out.println(total);
    }

    private static int sum(ArrayList<Integer> list, int index) {
        if (list.size() == index) {
            return 0;
        }

        int num = list.get(index);
        return num + sum(list, index + 1);
    }
}
