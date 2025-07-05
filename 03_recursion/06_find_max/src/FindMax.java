import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        System.out.println(findMax(Arrays.asList(2, 3, 98, 150, 4, 6)));
    }

    private static int findMax(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        if (list.size() == 1) {
            return list.getFirst();
        }
        if (list.size() == 2) {
            return list.get(0) > list.get(1) ? list.get(0) : list.get(1);
        }

        int subMax = findMax(list.subList(1, list.size()));
        return list.get(0) > subMax ? list.get(0) : subMax;
    }
}
