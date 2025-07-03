package main;

public class BinarySearch {

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3));
        System.out.println(binarySearch(myList, 9));
        System.out.println(binarySearch(myList, -1));
    }

    public static int binarySearch(int[] list, int item) {
        if (list.length == 0) {
            return -1;
        }

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else if (guess < item ) {
                low = mid + 1;
            }
        }

        return -1;
    }
}
