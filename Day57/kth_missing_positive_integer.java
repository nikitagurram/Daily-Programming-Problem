package Day57;

/*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.
Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6. */
public class kth_missing_positive_integer {
    public static int findKthPositive(int[] arr, int k) {
        int j = 1;
        while (true) {
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (j == arr[i]) {
                    flag = false;
                    break;
                } else if (j < arr[i])
                    break;
            }
            if (flag == true) {
                k--;
            }
            if (k == 0)
                return j;
            j++;
        }
        // int index=0;
        // int count=0;
        // for(int i=1;i<arr[arr.length-1];i++){
        // if(arr[index]==i){
        // index++;
        // }
        // else{
        // count++;
        // if(count==k) return i;
        // }
        // }
        // return arr[arr.length-1]+k-count;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8, 10 };
        int k = 3;
        System.out.println(findKthPositive(arr, k));
    }
}
