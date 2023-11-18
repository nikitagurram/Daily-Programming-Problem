package Day51;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * count_even_odd
 * You have been given an arraylist of integers 'ARR' of size
 * 'N'. Your task is to find two things-
 * 1. The number of elements that are occurring an Odd number of times.
 * 2. The number of elements that are occurring Even a number of times.
 * For Example:
 * ARR [2, 1, 2, 1, 5, 5, 2]
 * Output: 1 2
 * 2 occurs three (odd) times.
 * 1 occurs two (even) times.
 * 5 occurs two (even) Ames.
 * So, the total 1 element is occurring an odd number of times and 2 elements
 * are occurring an even number of times.
 */
public class count_even_odd {
    public static void main(String[] args) {
        ArrayList<Integer> counted = new ArrayList<>();
        int arr[] = { 1, 2, 1, 2, 3, 4, 5 };
        int n = 7;
        Arrays.sort(arr);
        int ans[] = new int[2];
        for (int i = 0; i < n; i++) {
            if (counted.contains(arr[i]))
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else {
                    break;
                }
            }
            counted.add(arr[i]);
            if (count % 2 == 0) {
                ans[1]++;
            } else {
                ans[0]++;
            }
        }
        System.out.println(ans[0] + " " + ans[1]);

    }

}