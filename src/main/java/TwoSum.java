import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * LeetCode 1
 *
 * @author RakhmedovRS
 * @created 15-Feb-20
 */
public class TwoSum
{
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
		{
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++)
		{
			Integer value = map.get(target - nums[i]);
			if (value != null && value != i)
			{
				return new int[]{i, value};
			}
		}

		return null;
	}
}