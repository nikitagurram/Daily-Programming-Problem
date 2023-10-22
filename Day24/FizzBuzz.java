package Day24;

import java.util.ArrayList;

/*Given an integer n, return a string array answer (1-indexed) where:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
Input: n = 3
Output: ["1","2","Fizz"] */
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                ans.add("FizzBuzz");
            else if (i % 3 == 0)
                ans.add("Fizz");
            else if (i % 5 == 0)
                ans.add("Buzz");
            else
                ans.add(Integer.toString(i));
        }
        System.out.println(ans);
    }
}
