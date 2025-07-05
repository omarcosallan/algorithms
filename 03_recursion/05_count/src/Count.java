import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        System.out.println(count(Arrays.asList(2, 4, 6)));
    }

    private static int count(List<Integer> list) {
        if (list.size() == 1) {
            return 1;
        }
        return 1 + count(list.subList(1, list.size()));
    }
}
