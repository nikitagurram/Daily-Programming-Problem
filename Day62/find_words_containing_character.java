package Day62;

import java.util.ArrayList;
import java.util.List;

/*You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.
Example 1:
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
Example 2:
Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
Example 3:
Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array. */
public class find_words_containing_character {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        String words[] = { "leet", "code" };
        char x = 'e';
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x)))
                res.add(i);
        }
        // for(int i=0;i<words.length;i++){
        // for(int j=0;j<words[i].length();j++){
        // if(words[i].charAt(j)==x){
        // res.add(i);
        // break;
        // }
        // }
        // }
        System.out.println(res);
    }
}
