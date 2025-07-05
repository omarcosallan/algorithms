import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Quicksort {
    public static void main(String[] args) {
        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3)));
    }

    private static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            int pivot = list.getFirst();

            List<Integer> less = list.stream().skip(1).filter(e -> e <= pivot)
                    .toList();
            List<Integer> greater = list.stream().skip(1).filter(e -> e > pivot)
                    .toList();

            return Stream.of(
                    quicksort(less).stream(),
                    Stream.of(pivot),
                    quicksort(greater).stream())
                    .flatMap(Function.identity()).toList();
        }
    }
}
