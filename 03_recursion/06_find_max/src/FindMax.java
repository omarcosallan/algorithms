import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 5, 10, 25, 16, 1}));
    }

    private static int max(int[] arr) {
        if (arr.length == 2) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }
        int subMax = max(Arrays.copyOfRange(arr, 1, arr.length));
        return arr[0] > subMax ? arr[0] : subMax;
    }
}
