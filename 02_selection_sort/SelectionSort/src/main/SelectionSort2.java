package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr));
    }

    private static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            newArr.add(arr.remove(smallest));
        }

        return newArr;
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
