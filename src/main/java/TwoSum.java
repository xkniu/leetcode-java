import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>((int) (nums.length / 0.75) + 1);
        for (int i = 0; i < nums.length; map.put(nums[i], ++i)) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{ map.get(target - nums[i]), i + 1 };
            }
        }
        return new int[0];
    }
}
