import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice. You can return the answer in any order.
     */
    public static void main(String[] args) {
        int[] nums = {5, 6, 29, 694, 45, 2, 56, 31};
        int target = 60;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x = 0; x < nums.length; x++) {
            int nowValue = nums[x];
            int complement = target - nowValue;

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), x};
            }
            map.put(nowValue, x);
        }
         return null;
    }
}