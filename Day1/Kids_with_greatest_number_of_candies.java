package Day1;
/*
 * There are n kids with candies. You are given an integer array candies,
 *  where each candies[i] represents the number of candies the ith kid has, 
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
 */

import java.util.ArrayList;
import java.util.List;

public class Kids_with_greatest_number_of_candies {
    public static void main(String[] args) {
        int candies[] = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> list = new ArrayList<>();
        list = kidsWithCandies(candies, extraCandies);
        System.out.println(list);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max1 = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (max1 < candies[i])
                max1 = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            int m = candies[i] + extraCandies;
            if (max1 <= m) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

}
