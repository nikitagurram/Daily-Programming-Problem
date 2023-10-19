/*Given an array Arr of N positive integers. 
Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.*/

import java.util.ArrayList;

public class value_equal_to_index_value {
    public static void main(String[] args) {
        int arr[] = { 1, 15, 3, 5, 4, 6 };
        int n = 6;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1)
                list.add(i + 1);
        }
        System.out.println(list);
    }
}
