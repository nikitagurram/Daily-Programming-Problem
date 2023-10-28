package Day30;

import java.util.Arrays;
import java.util.Collections;

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
