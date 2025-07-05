import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        System.out.println(count(new int[]{0, 1, 2, 3, 4, 5}));
    }

    private static int count(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
