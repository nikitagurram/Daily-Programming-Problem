package Day86;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3 };
        System.out.println(permute(num));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        FindAllPermutation(res, nums, new ArrayList(), visited);
        return res;
    }

    static void FindAllPermutation(List<List<Integer>> res, int[] nums, List<Integer> curr, boolean[] visited) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == true)
                continue;
            curr.add(nums[i]);
            visited[i] = true;
            FindAllPermutation(res, nums, curr, visited);
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }
}
