package collections_in_java;

import java.util.HashMap;
import java.util.Map;

public class ExampleCode {
    public static void main(String[] lkm) {

        int[] array = { 10, 20, 30, 40 };

        System.out.println(twoSum(array, 50)[0] + ", " + twoSum(array, 50)[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + nums[j] + "," + i + "," + j);
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    // using MAP collection

    public int[] addTwoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
