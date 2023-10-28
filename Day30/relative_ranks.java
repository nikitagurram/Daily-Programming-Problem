import java.util.Arrays;
import java.util.Collections;

/*You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. 
The placement of each athlete determines their rank:
The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th]. */
public class relative_ranks {
    public static void main(String[] args) {
        int score[] = { 5, 3, 4, 2, 1 };
        Integer s[] = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            s[i] = score[i];
        }
        Arrays.sort(s, Collections.reverseOrder());
        String str[] = new String[score.length];
        // int n=score.length-1;
        for (int i = 0; i < score.length; i++) {
            if (s[0] == score[i])
                str[i] = "Gold Medal";
            else if (s[1] == score[i])
                str[i] = "Silver Medal";
            else if (s[2] == score[i])
                str[i] = "Bronze Medal";
            else {
                for (int j = 3; j < score.length; j++) {
                    String a = "";
                    if (s[j] == score[i]) {
                        a = a + (j + 1);
                        str[i] = a;
                    }
                }
            }
        }
        for (String i : str) {
            System.out.println(i);
        }
    }
}
