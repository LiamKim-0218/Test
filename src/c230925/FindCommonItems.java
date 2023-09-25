package c230925;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonItems {
    static int[] findCommonItems(int[] arr1, int[] arr2, int[] arr3) {
     
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        for (int num : arr3) {
            if (set1.contains(num) && set2.contains(num)) {
                result.add(num);
            }
        }

        int[] commonItems = new int[result.size()];
        int index = 0;
        for (int num : result) {
            commonItems[index++] = num;
        }

        return commonItems;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 5, 10};
        int[] arr2 = {3, 4, 5, 10};
        int[] arr3 = {5, 5, 10, 20};

        int[] commonItems = findCommonItems(arr1, arr2, arr3);

        for (int num : commonItems) {
            System.out.println(num);
        }
    }
}