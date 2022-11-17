package DataStructureI;

public class MaxSubArray {

	public static int maxSubArray(int[] nums) {
		if(nums.length ==1) return nums[0];
		int sum =0;
		int max = Integer.MIN_VALUE;
		for (int i : nums) {
			sum = sum + i;
			max = Math.max(max, sum);
			System.out.println("Sum:" + sum + "Max:" + max);
			if(sum < 0) sum = 0;
			
		} 
		return max;
	}
	
}
