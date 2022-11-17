package DataStructureI;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[j] + nums[i]) == target) {
					ans[0] = j;
					ans[1] = i;
					break;
				}

			}

		}

		return ans;
	}

	public int[] twoSum1(int[] nums, int target) { // tối ưu
		Map<Integer, Integer> complement = new HashMap<>();

		for (int i = 0; i < nums.length; ++i) {
			int temp = target - nums[i];

			if (complement.containsKey(temp)) {
				return new int[] { complement.get(temp), i };
			}

			complement.put(nums[i], i);
		}

		return null;
	}

	public int[] twoSum2(int[] nums, int target) { // tối ưu
//		Map<Integer , Integer> map = new HashMap<Integer , Integer>();
		int[] ans = new int[2];
		for (int i = 0; i < nums.length -1; i++) {
			if(nums[i] + nums[i+1] == target) {
				ans[0] =i;
				ans[1] =i+1 ;
				return ans;
			}
			
		}

		return null; // dùng hash map khi cần return nhiều đối tượng
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
